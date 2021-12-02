package com.ewalllet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaServer
@EnableMongoRepositories
public class EwalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EwalletServiceApplication.class, args);
	}

}
