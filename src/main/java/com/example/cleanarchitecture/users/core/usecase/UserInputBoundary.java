package com.example.cleanarchitecture.users.core.usecase;

import com.example.cleanarchitecture.users.core.dto.UserRequestModel;
import com.example.cleanarchitecture.users.core.dto.UserResponseModel;

public interface UserInputBoundary {

    UserResponseModel create(UserRequestModel userRequestModel);
}
