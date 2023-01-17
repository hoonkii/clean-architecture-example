package com.example.cleanarchitecture.users.adapters.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* JpaRepository를 위한 JpaUserRepository 클래스입니다.
* */
@Repository
public interface JpaUserRepository extends JpaRepository<JpaUserDataMapper, String> {
    boolean existsByEmail(String email);
}
