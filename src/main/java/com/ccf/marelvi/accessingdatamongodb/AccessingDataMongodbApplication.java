package com.ccf.marelvi.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ccf.marelvi.repositorys.interfaces.UserRepository;
import com.ccf.marelvi.models.User;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        userRepository.deleteAll();

        userRepository.save(new User("gdfgfd"));

    }

}
