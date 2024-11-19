package com.RestApiProject.SocialProject.service;

import com.RestApiProject.SocialProject.request.UserRequest;
import com.RestApiProject.SocialProject.response.UserResponse;

import java.util.List;

public interface UserService {


    void createUser(UserRequest request);

    UserResponse getUser(Long id);

    List<UserResponse> getAllUser();

    UserResponse updateById(UserRequest request, Long userId);

    String deleteById(Long userId);
}
