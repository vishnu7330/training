package com.training.authentication.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LdapAuthenticationAuthorizationExampleApplication {

	
	public static void main(String[] args) {
		System.out.println("Starting app");
		SpringApplication.run(LdapAuthenticationAuthorizationExampleApplication.class, args);
	}

}
