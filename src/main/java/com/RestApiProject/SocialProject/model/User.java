package com.RestApiProject.SocialProject.model;

import com.RestApiProject.SocialProject.request.UserRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
private String userName;
private String password;
private String email;
//    @ManyToOne
//    @JoinColumn(name = "role")
//    private RoleEntity role;

    public User(UserRequest request) {
        this.userName = request.getUserName();
        this.password = request.getPassword();
        this.email = request.getEmail();

    }
}
