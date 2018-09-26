package com.san.test.JenkinsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
	    System.out.println("Starting Spring Boot application...");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
}
