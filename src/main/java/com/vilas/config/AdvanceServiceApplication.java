package com.vilas.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdvanceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvanceServiceApplication.class, args);
	}

}
