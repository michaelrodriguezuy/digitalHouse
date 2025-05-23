package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController
{
    @GetMapping("/anonymous")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("hello Anonymous");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("hello Admin");
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("hello User");
    }
}
