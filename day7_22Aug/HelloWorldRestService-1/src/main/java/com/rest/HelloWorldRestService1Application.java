package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldRestService1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestService1Application.class, args);
	}

	@Bean
	public HelloWorldBean getBean() {
		
		return new HelloWorldBean();
	}
}
