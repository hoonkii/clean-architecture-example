package com.example.cleanarchitecture.users.adapters.repository.jpa;

import com.example.cleanarchitecture.users.core.dto.UserPersistenceRequestModel;
import com.example.cleanarchitecture.users.core.repository.UserPersistenceGateway;
import lombok.RequiredArgsConstructor;

/*
* UserRegisterDataStoreGateway를 상속한 실제 JPA repository의 구현체 입니다.
* */
@RequiredArgsConstructor
public class JpaUserRepositoryAdapter implements UserPersistenceGateway {

    private final JpaUserRepository repository;

    @Override
    public boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    public void save(UserPersistenceRequestModel model) {
        repository.save(new JpaUserDataMapper(model.getEmail(), model.getPassword(), model.getCreatedAt()));
    }
}
