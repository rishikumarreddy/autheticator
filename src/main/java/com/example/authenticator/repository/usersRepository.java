package com.example.authenticator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.authenticator.model.User;

@Repository
public interface usersRepository extends JpaRepository<User, String>{

  User findById(String id);
  
}
