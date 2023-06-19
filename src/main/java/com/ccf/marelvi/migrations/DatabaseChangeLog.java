package com.ccf.marelvi.migrations;

import com.ccf.marelvi.models.Role;
import com.ccf.marelvi.models.enums.ERole;
import com.ccf.marelvi.repositorys.interfaces.RoleRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import java.util.ArrayList;
import java.util.List;
 
 
@ChangeLog
public class DatabaseChangeLog {
 
    @ChangeSet(order = "001", id = "seedDatabase", author = "Stefan")
    public void seedDatabase(RoleRepository roleRepository) {
        List<Role> roles = new ArrayList<>();
        roles.add(createNewRole(ERole.ROLE_ADMINISTRATOR));
        roles.add(createNewRole(ERole.ROLE_DEPARTMENT_HEAD));
        roles.add(createNewRole(ERole.ROLE_PROJECT_MANAGER));
        roles.add(createNewRole(ERole.ROLE_USER));
 
        roleRepository.insert(roles);
    }
 
    private Role createNewRole(ERole name) {
        Role role = new Role();
        role.setName(name);
        return role;
    }
}