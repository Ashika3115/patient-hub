package com.assignment.patient.hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.assignment.patient.hub.entity"})  // force scan JPA entities
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
