package com.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class FirstprojectApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
}
