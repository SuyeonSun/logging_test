package com.example.loggerTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoggerTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoggerTestApplication.class, args);
		System.out.println("====== logging test =====");
		String message = "logging test with logger";
		log.error("error mode, {}", message);
		log.info("error mode, {}", message);
		System.out.println("====== end =====");
	}
}
