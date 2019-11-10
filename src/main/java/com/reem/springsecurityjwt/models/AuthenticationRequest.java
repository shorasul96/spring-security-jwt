package com.reem.springsecurityjwt.models;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String userName, password;
}
