package com.Dosinger.userservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dosinger.userservice.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    
}