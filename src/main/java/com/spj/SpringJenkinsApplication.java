package com.spj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	
	Logger logger =LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init(String msg) {
		logger.info("Application started...");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	
	
	
	
	}

}
