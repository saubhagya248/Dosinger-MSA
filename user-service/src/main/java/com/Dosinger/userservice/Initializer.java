package com.Dosinger.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Dosinger.userservice.Model.User;
import com.Dosinger.userservice.Repository.UserRepository;

@Component
public class Initializer implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(User.builder()
        .name("Saubhagya")
        .email("saubhagyagupta8@gmail.com")
        .build());
    }
    
}
