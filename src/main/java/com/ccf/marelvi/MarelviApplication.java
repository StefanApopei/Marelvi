package com.ccf.marelvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.github.cloudyrock.spring.v5.EnableMongock;

@SpringBootApplication
@EnableMongoRepositories
@EnableMongock
public class MarelviApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarelviApplication.class, args);
	}

}
