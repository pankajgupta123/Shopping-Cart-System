package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.product.service.ProductServiceImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import com.profile.userprofile.daolayer.ProfileServiceImpl;

@SpringBootApplication
@EnableMongoRepositories
@EnableEurekaServer
@EnableSwagger2
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	public ProductServiceImpl proService()
	{
		return new ProductServiceImpl();
	}

}
