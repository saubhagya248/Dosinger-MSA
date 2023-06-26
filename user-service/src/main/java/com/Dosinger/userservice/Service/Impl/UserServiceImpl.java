package com.Dosinger.userservice.Service.Impl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dosinger.userservice.DTO.UserRequestDto;
import com.Dosinger.userservice.DTO.UserResponseDto;
import com.Dosinger.userservice.Exceptions.UserAlreadyExistsException;
import com.Dosinger.userservice.Model.User;
import com.Dosinger.userservice.Repository.UserRepository;
import com.Dosinger.userservice.Service.UserService;
import com.Dosinger.userservice.Transformer.UserTransformer;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }
    @Override
    public UserResponseDto addUser(UserRequestDto requestDto) throws UserAlreadyExistsException{

        Optional<User> userOpt = repository.findByEmail(requestDto.getEmailId());

        if(userOpt.isPresent()) throw new UserAlreadyExistsException("User with given email already exists");

        User user = repository.save(UserTransformer.UserRequestDtoToUser(requestDto));

        return UserTransformer.UserToUserResponseDto(user);
    }


    
}