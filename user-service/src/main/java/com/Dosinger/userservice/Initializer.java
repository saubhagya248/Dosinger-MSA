package com.Dosinger.userservice;

import com.Dosinger.userservice.Enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.Dosinger.userservice.Enums.Gender;
import com.Dosinger.userservice.Model.User;
import com.Dosinger.userservice.Repository.UserRepository;

@Component
public class Initializer implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
        .name("Saubhagya")
        .age(21)
        .gender(Gender.MALE)
        .mobile("9682479221")
        .email("saubhagyagupta8@gmail.com")
        .password(passwordEncoder.encode("Saubhagya@123"))
                .role(Role.USER)
        .build();
        userRepository.save(user);
    }
    
}
