package com.RestApiProject.SocialProject.repository;

import com.RestApiProject.SocialProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long> {
}
