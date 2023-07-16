package com.example.authenticator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.authenticator.model.User;
import com.example.authenticator.repository.usersRepository;

@Service
public class usersService {

  @Autowired
  private usersRepository repository;

  public User getUser(String id){
    return repository.findById(id);
  }
  
}
