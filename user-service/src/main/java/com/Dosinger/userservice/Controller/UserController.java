package com.Dosinger.userservice.Controller;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Dosinger.userservice.DTO.UserRequestDto;
import com.Dosinger.userservice.Model.User;
import com.Dosinger.userservice.Service.Impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/home")
    public String greet(){
        return "Hello";
    }

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    public User addUser(@RequestBody UserRequestDto requestDto){
        userService.addUser(requestDto);
        return response;
    }
}