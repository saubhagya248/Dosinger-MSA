package com.Dosinger.userservice.Model;



import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Component;

import com.Dosinger.userservice.Enums.Gender;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "`user`")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @Column(name = "email", unique = true, nullable = false)
    String email;

    @Column(name = "password", nullable = false)
    String password;

    
    @Column(name = "mobile", unique = true, nullable = false)
    String mobile;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    Gender gender;


}