package com.cloud.config.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigExampleApplication.class, args);
	}

}
