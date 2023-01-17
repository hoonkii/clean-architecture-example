package com.example.cleanarchitecture.users.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class UserPersistenceRequestModel {

    private String email;
    private String password;
    private LocalDateTime createdAt;
}
