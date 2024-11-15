package com.RestApiProject.SocialProject.repository;

import com.RestApiProject.SocialProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {





}
