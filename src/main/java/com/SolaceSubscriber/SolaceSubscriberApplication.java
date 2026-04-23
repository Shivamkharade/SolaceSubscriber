package com.SolaceSubscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SolaceSubscriberApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
	    System.setProperty("MAIL", dotenv.get("MAIL"));
	    System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));
		SpringApplication.run(SolaceSubscriberApplication.class, args);
	}

}
