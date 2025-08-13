package com.vkostylev.edu.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    Instant registrationDate;
}
