package com.ccf.marelvi.repositorys.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ccf.marelvi.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    
    public User findUserByName(String name);

}