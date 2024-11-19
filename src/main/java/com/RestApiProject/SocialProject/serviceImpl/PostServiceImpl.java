package com.RestApiProject.SocialProject.serviceImpl;

import com.RestApiProject.SocialProject.model.Post;
import com.RestApiProject.SocialProject.repository.PostRepository;
import com.RestApiProject.SocialProject.request.PostRequest;
import com.RestApiProject.SocialProject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    public void createPost(PostRequest postRequest){
        postRepository.save(Po)
    }


}
