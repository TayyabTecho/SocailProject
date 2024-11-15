package com.RestApiProject.SocialProject.serviceImpl;

import com.RestApiProject.SocialProject.model.User;
import com.RestApiProject.SocialProject.repository.UserRepository;
import com.RestApiProject.SocialProject.request.UserRequest;
import com.RestApiProject.SocialProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public void createUser(UserRequest request) {

        User user = new User(request);
        repository.save(user);

    }
}
