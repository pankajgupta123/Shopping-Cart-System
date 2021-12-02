package com.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.profile.userprofile.daolayer.ProfileServiceImpl;

@SpringBootApplication
@EnableEurekaServer
@EnableMongoRepositories
public class ProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
		System.out.println("connected with mongodb");
	}
	@Bean
	public ProfileServiceImpl proService()
	{
		return new ProfileServiceImpl();
	}

}
