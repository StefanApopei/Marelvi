package com.ccf.marelvi.payloads.request;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SignupRequest {
    private String username;
    private String password;
    private Set<String> roles;
}
