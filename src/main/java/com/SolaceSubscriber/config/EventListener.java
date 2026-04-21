package com.SolaceSubscriber.config;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.SolaceSubscriber.Services.EmailService;
import com.SolaceSubscriber.event.UserLoginEvent;

@Component
public class EventListener {
	
	private final EmailService emailService;
	
	public EventListener(EmailService emailService1) {
		this.emailService = emailService1;
	}
	
	@Bean
	public Consumer<UserLoginEvent> userLogin(){
		
		return event ->{
			System.out.println("Recived Event : " + event.getEmail());
			emailService.sendEmail(event.getEmail());
		};
	}
	
}
