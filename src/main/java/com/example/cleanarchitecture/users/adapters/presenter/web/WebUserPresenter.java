package com.example.cleanarchitecture.users.adapters.presenter.web;

import com.example.cleanarchitecture.users.core.dto.UserResponseModel;
import com.example.cleanarchitecture.users.core.presenter.UserPresenter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Rest API에 맞게 응답을 변형시켜주는 Presenter의 실제 구현체 입니다.
 * */
public class WebUserPresenter implements UserPresenter {
    @Override
    public UserResponseModel prepareFailedView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    @Override
    public UserResponseModel prepareSucceedView(UserResponseModel userResponseModel) {
        LocalDateTime responseTime = LocalDateTime.parse(userResponseModel.getCreatedAt());
        userResponseModel.setCreatedAt(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return userResponseModel;
    }
}
