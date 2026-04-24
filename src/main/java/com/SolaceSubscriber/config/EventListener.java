package com.SolaceSubscriber.config;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.SolaceSubscriber.Services.DatabaseService;
import com.SolaceSubscriber.Services.EmailService;
import com.SolaceSubscriber.event.UserLoginEvent;

@Component
public class EventListener {
	
	private final EmailService emailService;
	
	private final DatabaseService databaseService;
	
	public EventListener(EmailService emailService1,DatabaseService databaseService1) {
		this.emailService = emailService1;
		this.databaseService = databaseService1;
	}
	
	@Bean
	public Consumer<UserLoginEvent> userLoginEmail(){
		
		return event ->{
			
			try {
	            System.out.println("Received Event: " + event.getEmail());

	            emailService.sendEmail(event.getEmail());

	        } catch (Exception e) {
	            System.out.println("Email failed but skipping retry: " + e.getMessage());
	        }
		};
	}
	
	@Bean
	public Consumer<UserLoginEvent> userLoginStore(){
		return event ->{
			System.out.println("Saving the user login time to db");
			databaseService.saveEvent(event);
		};
	}
	
}
