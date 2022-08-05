package com.training.micro.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroApiGatewayApplication.class, args);
	}

}
