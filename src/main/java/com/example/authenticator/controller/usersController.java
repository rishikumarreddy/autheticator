package com.example.authenticator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.authenticator.model.User;
import com.example.authenticator.service.usersService;

@RestController
public class usersController {

  @Autowired
  private usersService service;

  @GetMapping("/user")
  public User getUser(@PathVariable String id){
    return service.getUser(id);
  }
  
}
