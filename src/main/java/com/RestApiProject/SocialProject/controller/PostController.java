package com.RestApiProject.SocialProject.controller;

import com.RestApiProject.SocialProject.request.PostRequest;
import com.RestApiProject.SocialProject.service.PostService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PostController {
    @Autowired
    private PostService service;
@PostMapping("/")
    public void createPost(@RequestBody PostRequest postRequest){
       service.createPost(postRequest);
    }
}
