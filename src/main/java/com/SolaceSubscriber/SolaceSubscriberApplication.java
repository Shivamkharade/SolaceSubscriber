package com.SolaceSubscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SolaceSubscriberApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
	    System.setProperty("MAIL_USERNAME", dotenv.get("MAIL_USERNAME"));
	    System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));
	    System.setProperty("MYSQL_PASSWORD", dotenv.get("MYSQL_PASSWORD"));
		System.setProperty("MYSQL_USERNAME",dotenv.get("MYSQL_USERNAME"));
		SpringApplication.run(SolaceSubscriberApplication.class, args);
	}

}
