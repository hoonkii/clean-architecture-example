package com.example.cleanarchitecture.users.core.usecase;

import com.example.cleanarchitecture.users.core.dto.UserPersistenceRequestModel;
import com.example.cleanarchitecture.users.core.dto.UserRequestModel;
import com.example.cleanarchitecture.users.core.dto.UserResponseModel;
import com.example.cleanarchitecture.users.core.entity.User;
import com.example.cleanarchitecture.users.core.entity.UserFactory;
import com.example.cleanarchitecture.users.core.repository.UserPersistenceGateway;
import com.example.cleanarchitecture.users.core.presenter.UserPresenter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

/*
 * UserInputBoundary 의 실제 구현체 입니다.
 *
 * DataStoreGateway, UserPresenter, UserFactory를 통해서 도메인 로직을 실행시키고 영속성 layer를 호출하고, 뷰를 관장하는 Presenter를 호출합니다.
 * 이 때 각 컴포넌트의 실제 구현은 알지 못합니다. 즉 UI, DB가 어떻게 동작하는지에 대해서 어떠한 가정도 하지 않습니다.
 * */
@RequiredArgsConstructor
public class UserRegisterInteractor implements UserInputBoundary {

    private final UserPersistenceGateway userRegisterDataStoreGateway;
    private final UserPresenter userPresenter;
    private final UserFactory userFactory;

    @Override
    public UserResponseModel create(UserRequestModel userRequestModel) {
        if (userRegisterDataStoreGateway.existsByEmail(userRequestModel.getEmail())) {
            return userPresenter.prepareFailedView("User already existed");
        }

        User user = userFactory.create(userRequestModel.getEmail(), userRequestModel.getRawPassword());
        if (!user.passwordIsValid()) {
            return userPresenter.prepareFailedView("User password must have more than 5 characters.");
        }

        LocalDateTime now = LocalDateTime.now();
        userRegisterDataStoreGateway.save(new UserPersistenceRequestModel(user.getEmail(), user.getPassword(), now));

        UserResponseModel accountResponseModel = new UserResponseModel(user.getEmail(), now.toString());
        return userPresenter.prepareSucceedView(accountResponseModel);
    }
}
