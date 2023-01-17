package com.example.cleanarchitecture.users.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GeneralUser implements User {

    private String email;
    private String password;

    @Override
    public boolean passwordIsValid() {
        return password != null && password.length() > 8;
    }
}
