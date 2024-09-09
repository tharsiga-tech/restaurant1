package com.example.ABC_Restaurant_Web_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AbcRestaurantWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(AbcRestaurantWebApplication.class, args);
	}

}
