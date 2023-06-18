package com.ccf.marelvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EntityScan(basePackages = { "com.ccf.marelvi.models" })
public class MarelviApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarelviApplication.class, args);
	}

}
