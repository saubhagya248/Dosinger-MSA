package com.Dosinger.userservice.Controller;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dosinger.userservice.Model.User;

@RestController
@RequestMapping("/user")
public class UserController{

    @RequestMapping("/home")
    public String greet(){
        return "Hello";
    }

    @PostMapping("/add")
    public String addUser(){
        return "Hello User";
    }
}