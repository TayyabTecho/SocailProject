package com.RestApiProject.SocialProject.controller;

import com.RestApiProject.SocialProject.request.UserRequest;
import com.RestApiProject.SocialProject.service.UserService;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/")
    public void createUser(@RequestBody UserRequest request) {
        service.createUser(request);

    }
}
