package com.example.cleanarchitecture.users.core.entity;

/*
* UserFactory의 실제 구현체 입니다.
* */
public class GeneralUserFactory implements UserFactory{
    @Override
    public User create(String email, String password) {
        return new GeneralUser(email, password);
    }
}
