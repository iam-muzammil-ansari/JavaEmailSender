package org.geekster;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    void SendEmail() {
        Properties sysProp = System.getProperties();

        System.out.println(sysProp);

        sysProp.put("mail.smtp.host",EmailData.HostServer);
        sysProp.put("mail.smtp.port",EmailData.port);
        sysProp.put(EmailData.sslProperty,"true");
        sysProp.put(EmailData.authPerm,"true");



        Session session = Session.getInstance(sysProp, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailData.senderEmail,EmailData.senderPassword);
            }
        });
        try{
            MimeMessage mimeMessage = new MimeMessage(session);

            mimeMessage.setFrom(EmailData.senderEmail);
            mimeMessage.setSubject("This my java Email Sender");
            mimeMessage.setText("Hey this is Muzammil" + "\n" + "How are you Friends");

            String[]  recipients= {EmailData.receiverEmail1,EmailData.receiverEmail2};
            InternetAddress[] internetAddresses = new InternetAddress[recipients.length];
            for(int i=0; i< recipients.length; i++) {
                internetAddresses[i] = new InternetAddress(recipients[i]);
            }
            mimeMessage.setRecipients(MimeMessage.RecipientType.TO,internetAddresses);

            Transport.send(mimeMessage);

            System.out.println("Email sent successfully");

        }catch (Exception mail) {
            System.out.println(mail.toString());
        }
    }
}
