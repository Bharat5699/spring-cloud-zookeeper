package com.example.dinner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DinnerApplication {
	
	public static void main(String args[]) {
		
		SpringApplication.run(DinnerApplication.class, args);
		
	}
}
