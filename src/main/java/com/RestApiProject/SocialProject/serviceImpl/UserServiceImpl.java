package com.RestApiProject.SocialProject.serviceImpl;

import com.RestApiProject.SocialProject.model.User;
import com.RestApiProject.SocialProject.repository.UserRepository;
import com.RestApiProject.SocialProject.request.UserRequest;
import com.RestApiProject.SocialProject.response.UserResponse;
import com.RestApiProject.SocialProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public void createUser(UserRequest request) {

        User user = new User(request);
        repository.save(user);

    }
@Override
    public UserResponse getUser(Long id){
        User entity = repository.findById(id).orElseThrow(()->new RuntimeException("user not found"));

        return new UserResponse(entity);
    }

    @Override
    public List<UserResponse> getAllUser() {
//        List<User> userList = repository.findAll();
//        List<UserResponse> responses=new ArrayList<>();
//        for (User user:userList){
//            UserResponse response = new UserResponse(user);
//            responses.add(response);
//        }
//        return responses;
        return repository.findAll().stream().map(UserResponse::new).toList();
    }

    @Override
    public UserResponse updateById(UserRequest request, Long userId) {
        User entity = repository.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
        if(request.getUserName()!=null){
            entity.setUserName(request.getUserName());
        }
        if(request.getPassword()!=null){
            entity.setPassword(request.getPassword());
        }
        if(request.getEmail()!=null){
            entity.setEmail(request.getEmail());
        }

        return new UserResponse(repository.save(entity));

    }

    @Override
    public String deleteById(Long userId) {
        User entity = repository.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
        repository.delete(entity);
        return "Deleted successfully";
    }

}
