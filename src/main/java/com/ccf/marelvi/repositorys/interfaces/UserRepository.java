package com.ccf.marelvi.repositorys.interfaces;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ccf.marelvi.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

}