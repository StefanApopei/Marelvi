package com.ccf.marelvi.repositorys.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ccf.marelvi.models.Projects;
import com.ccf.marelvi.models.User;
import com.ccf.marelvi.models.enums.EDepartment;

public interface ProjectRepository extends MongoRepository<Projects, String> {

    public User findProjectsByDepartment(EDepartment department);
}
