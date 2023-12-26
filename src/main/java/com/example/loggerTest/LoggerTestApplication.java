package com.example.loggerTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoggerTestApplication.class, args);
		System.out.println("====== logger test =====");
	}
}
