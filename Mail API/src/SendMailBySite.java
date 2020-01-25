import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMailBySite
{
	public static void main(String[] args)
	{

		String host = "smtp.gmail.com";
		final String user = "niketkumar18@gmail.com";// change accordingly
		final String password = "dsfsd";// change accordingly

		String to = "niketkumar024@gmail.com";// change accordingly

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication(user, password);
					}
				});

		// Compose the message
		try
		{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));
			message.setSubject("systems domain");
			message.setText("This is simple program of sending email using JavaMail API");

			// send the message
			Transport.send(message);

			System.out.println("message sent successfully...");

		} catch (MessagingException e)
		{
			e.printStackTrace();
		}
	}
}