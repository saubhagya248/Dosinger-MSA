package com.Dosinger.userservice.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dosinger.userservice.Model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    public Optional<User> findByEmail(String email);
}