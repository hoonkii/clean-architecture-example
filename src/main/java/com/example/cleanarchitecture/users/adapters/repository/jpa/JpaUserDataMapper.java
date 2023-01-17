package com.example.cleanarchitecture.users.adapters.repository.jpa;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class JpaUserDataMapper {
    @Id
    private String email;

    private String password;

    private LocalDateTime createdAt;
}
