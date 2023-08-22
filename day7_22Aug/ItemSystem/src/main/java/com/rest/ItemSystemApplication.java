package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.controller","com.service"})
public class ItemSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemSystemApplication.class, args);
	}

}
