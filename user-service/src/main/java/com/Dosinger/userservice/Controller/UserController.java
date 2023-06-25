package com.Dosinger.userservice.Controller;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Dosinger.userservice.Model.User;

@RestController
@RequestMapping("/user")
public class UserController{

    @RequestMapping("/login")
    public String greet(){
        return "Hello";
    }



}