package com.Dosinger.userservice.Configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.Dosinger.userservice.Model.User;
import com.Dosinger.userservice.Repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(username);

        if(user.isEmpty()) throw new UsernameNotFoundException("user does not exist");
        
        UserDetails details = new CustomUserDetails(user.get());

        return details;
    }
    
}
