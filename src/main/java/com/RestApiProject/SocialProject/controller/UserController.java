package com.RestApiProject.SocialProject.controller;

import com.RestApiProject.SocialProject.request.GetRequest;
import com.RestApiProject.SocialProject.request.UserRequest;
import com.RestApiProject.SocialProject.response.UserResponse;
import com.RestApiProject.SocialProject.service.UserService;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/")
    public void createUser(@RequestBody UserRequest request) {
        service.createUser(request);

    }
     @GetMapping("/{userId}")
    public UserResponse getUserById(@PathVariable Long userId){
        return service.getUser(userId);
    }

    @GetMapping("/")
    public List<UserResponse> getAll(){
        return service.getAllUser();
    }
    @PutMapping("/{userId}")
    public UserResponse updateById(@RequestBody UserRequest request,@PathVariable Long userId){
        return service.updateById(request,userId);
    }
    @DeleteMapping("/{userId}")
    public String deleteById(@PathVariable Long userId){
        //service.deleteById(userId);
        return service.deleteById(userId);
    }
//@GetMapping("/{userId}")
//public UserResponse getUserById(@PathVariable Long userId){
//    return service.getUser(userId);
//
//}
}

