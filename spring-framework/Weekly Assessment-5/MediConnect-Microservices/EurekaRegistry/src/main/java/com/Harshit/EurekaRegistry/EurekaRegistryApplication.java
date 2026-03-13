package com.Harshit.EurekaRegistry;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryApplication.class, args);
	}

}
