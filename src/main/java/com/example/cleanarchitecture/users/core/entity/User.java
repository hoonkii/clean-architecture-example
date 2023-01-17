package com.example.cleanarchitecture.users.core.entity;

/*
* 유저라는 비즈니스 모델이 가져야할 요건에 대한 인터페이스 입니다.
* */
public interface User {
    boolean passwordIsValid();

    String getEmail();

    String getPassword();
}
