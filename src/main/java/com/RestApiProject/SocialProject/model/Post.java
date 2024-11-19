package com.RestApiProject.SocialProject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String title;
    private String content;
    private String created_at;
    private String updated_at;

@ManyToOne
    @JoinColumn(name = "author_id")
    private User users;
 }
