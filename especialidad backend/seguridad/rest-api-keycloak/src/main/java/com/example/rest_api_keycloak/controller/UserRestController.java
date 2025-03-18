package com.example.rest_api_keycloak.controller;

import com.example.rest_api_keycloak.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest_api_keycloak.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getById(@PathVariable String id){
        return userService.findById(id);
    }
@GetMapping("/users/{name}")
    public List<User> getByUsername (@PathVariable String name){
        return userService.findByUsername(name);
    }

}
