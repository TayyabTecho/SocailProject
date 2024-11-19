package com.RestApiProject.SocialProject.response;

import com.RestApiProject.SocialProject.model.User;
import lombok.Data;

@Data
public class UserResponse {

    private Long userId;
    private String userName;
    private String password;
    private String email;

    public UserResponse(User source) {
        this.userId = source.getUserId();
        this.userName = source.getUserName();
        this.password = source.getPassword();
        this.email = source.getEmail();
    }
}