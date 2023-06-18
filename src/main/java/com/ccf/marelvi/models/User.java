package com.ccf.marelvi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ccf.marelvi.models.enums.EDepartment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    @NotBlank
    @Size(max = 20)
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private EDepartment department;

  @DBRef
  private Set<Role> roles = new HashSet<>();

    public User(String _firstName, String _lastName, String _userName, Set<Role> _roles, EDepartment _department,
            String _password) {
        this.username = _userName;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.roles = _roles;
        this.department = _department;
        this.password = _password;
    }

    public User(String _userName, String _password) {
        this.username = _userName;
        this.password = _password;
    }
}
