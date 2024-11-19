package com.RestApiProject.SocialProject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "comments")
public class  Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    private String created_at;
    private String content;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post posts;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private User users;
}