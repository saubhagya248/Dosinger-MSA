package com.Dosinger.userservice.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dosinger.userservice.DTO.UserRequestDto;
import com.Dosinger.userservice.Repository.UserRepository;

@Service
public class UserService{

    @Autowired
    private UserRepository repository;
    public UserService(UserRepository repository){
        this.repository = repository;
    }


    public void addUser(UserRequestDto requestDto){

    }
}