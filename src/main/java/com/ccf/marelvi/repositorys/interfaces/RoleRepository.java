package com.ccf.marelvi.repositorys.interfaces;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ccf.marelvi.models.Role;
import com.ccf.marelvi.models.enums.ERole;

public interface RoleRepository extends MongoRepository<Role, String>{
    Optional<Role> findByName(ERole name);
}
