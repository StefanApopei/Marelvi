package com.ccf.marelvi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ccf.marelvi.repositorys.interfaces.ItemRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MarelviApplication {

	@Autowired
    ItemRepository groceryItemRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MarelviApplication.class, args);
	}

}
