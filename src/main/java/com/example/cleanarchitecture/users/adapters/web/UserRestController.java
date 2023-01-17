package com.example.cleanarchitecture.users.adapters.web;

import com.example.cleanarchitecture.users.core.dto.UserRequestModel;
import com.example.cleanarchitecture.users.core.dto.UserResponseModel;
import com.example.cleanarchitecture.users.core.usecase.UserInputBoundary;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRestController {

    private final UserInputBoundary userInputBoundary;

    @PostMapping
    private UserResponseModel createUser(@RequestBody UserRequestModel userRequestModel) {
        return userInputBoundary.create(userRequestModel);
    }
}
