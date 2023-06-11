# Java Email Sender

This is a simple Java application that demonstrates how to send emails using the JavaMail API and Gmail SMTP server.

## Prerequisites
- Java Development Kit (JDK) installed
- Maven installed

## Getting Started
1. Navigate to the project directory: `cd your-repository`
2. Open the project in your preferred Java IDE.
3. Build the project using Maven: `mvn clean package`
4. Run the application: `java -cp target/Muzammil-1.0-SNAPSHOT.jar org.geekster.Main`

## Configuration
The application uses the following configuration properties defined in the `EmailData` class:
- `HostServer`: The SMTP server host. In this case, it is set to `smtp.gmail.com`.
- `port`: The SMTP server port. The default port for SSL-enabled connections is `465`.
- `sslProperty`: Property to enable SSL for the SMTP connection.
- `authPerm`: Property to enable SMTP authentication.
- `senderEmail`: The email address of the sender.
- `senderPassword`: The password of the sender's email account."Password is Tremporary"
- `receiverEmail1`: The first recipient's email address.
- `receiverEmail2`: The second recipient's email address.

Make sure to update the `senderEmail` and `senderPassword` fields with your own Gmail credentials.

## Dependencies
The project uses the following dependencies managed by Maven:
- [javax.mail](https://mvnrepository.com/artifact/com.sun.mail/javax.mail) version 1.6.2

## License
This project is not licensed.
