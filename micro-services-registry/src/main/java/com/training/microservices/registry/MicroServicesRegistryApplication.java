package com.training.microservices.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesRegistryApplication.class, args);
	}

}
