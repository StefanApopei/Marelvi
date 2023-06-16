package com.ccf.marelvi.repositorys.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ccf.marelvi.models.User;

public interface ItemRepository extends MongoRepository<User, String> {
    
    @Query("{name:'?0'}")
    User findItemByName(String name);
    
    public long count();

}