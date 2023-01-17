package com.example.cleanarchitecture.users.core.entity;

/*
* User라는 비즈니스 모델을 생성하기 위한 Factory 인터페이스 입니다.
* 이 로직의 경우 User 비즈니스 모델 인터페이스에 정의할 수도 있습니다.
* */
public interface UserFactory {
    User create(String email, String password);
}
