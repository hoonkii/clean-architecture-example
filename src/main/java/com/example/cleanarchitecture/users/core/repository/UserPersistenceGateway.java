package com.example.cleanarchitecture.users.core.repository;

import com.example.cleanarchitecture.users.core.dto.UserPersistenceRequestModel;

/*
* User를 영속성 레이어에 저장하기 위한 인터페이스 입니다.
* JPA - Hibernate든, MyBatis든 하부 레이어의 기술과는 상관 없이 스펙을 정의합니다.
* 영속성을 담당하는 컴포넌트는 이 인터페이스를 상속함하게 함으로써 영속성 기술이 변경되어도 다른 컴포넌트의 변경없이 확장이 가능합니다.
* */
public interface UserPersistenceGateway {

    boolean existsByEmail(String email);
    void save(UserPersistenceRequestModel model);
}
