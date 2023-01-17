package com.example.cleanarchitecture.users.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserResponseModel {
    private String email;
    private String createdAt;

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
