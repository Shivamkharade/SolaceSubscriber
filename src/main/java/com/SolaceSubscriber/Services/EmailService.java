package com.SolaceSubscriber.Services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private final JavaMailSender javaMailSender;
	
	public EmailService(JavaMailSender javaMailSender1) {
		this.javaMailSender = javaMailSender1;
	}
	
	public void sendEmail(String to) {
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo(to);
		message.setSubject("Login Alert");
		message.setText("You have successfully logged in.");
		javaMailSender.send(message);
		System.out.println("Email sent to: " + to);
	}
}
