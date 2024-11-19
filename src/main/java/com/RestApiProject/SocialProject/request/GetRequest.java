package com.RestApiProject.SocialProject.request;

import lombok.Data;

@Data
public class GetRequest {

    private String userName;
    private String password;
    private String email;
}
