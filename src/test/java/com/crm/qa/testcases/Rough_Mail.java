package com.crm.qa.testcases;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Rough_Mail {

	public static void main(String[] args) {

		String host = "smtp.gmail.com";
		final String user = "qaaurora1@gmail.com";// change accordingly
		final String password = "energy123";// change accordingly

		String to = "rampal.singh@sts.in";// change accordingly
		// String cc = "vishal.patel@sts.in";// change accordingly

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587"); // TLS Port
		props.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// Compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			// message.addRecipient(Message.RecipientType.CC, new
			// InternetAddress(cc));

			message.setSubject("Test Mail");
			message.setText("This is simple program of sending email using JavaMail API");

			// send the message
			Transport.send(message);

			System.out.println("message sent successfully...");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}