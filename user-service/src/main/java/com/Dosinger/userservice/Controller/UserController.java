package com.Dosinger.userservice.Controller;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Dosinger.userservice.DTO.UserRequestDto;
import com.Dosinger.userservice.DTO.UserResponseDto;
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
    public UserResponseDto addUser(@RequestBody UserRequestDto requestDto){
        UserResponseDto response = userService.addUser(requestDto);
        return response;
    }
}