package com.cloud.client.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigClientExampleApplication implements CommandLineRunner {
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientExampleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.err.println(
				"This property is being taken from server ,application.name =" + env.getProperty("application.name"));

	}

}
