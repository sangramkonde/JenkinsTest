package com.san.test.JenkinsTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(JenkinsTestApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting Spring Boot application...");
		SpringApplication.run(JenkinsTestApplication.class, args);
		LOGGER.info("Stopping Spring Boot application...");
	}
}
