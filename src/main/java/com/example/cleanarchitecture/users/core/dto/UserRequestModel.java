package com.example.cleanarchitecture.users.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserRequestModel {
    private String email;
    private String rawPassword;
}
