package com.example.cleanarchitecture.users.core.presenter;

import com.example.cleanarchitecture.users.core.dto.UserResponseModel;

/*
 * UseCase의 도메인 로직 실행 후 View 단에 전달하는 결과물을 표현하는 인터페이스입니다.
 * Web 혹은 App 여러 환경에 따라 이 인터페이스를 상속하여 구현합니다.
 * */
public interface UserPresenter {

    UserResponseModel prepareFailedView(String error);
    UserResponseModel prepareSucceedView(UserResponseModel userResponseModel);
}
