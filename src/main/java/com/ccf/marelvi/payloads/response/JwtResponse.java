package com.ccf.marelvi.payloads.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class JwtResponse {
    private String jwt;
    private String username;
    private String id;
    private String roles;
}
