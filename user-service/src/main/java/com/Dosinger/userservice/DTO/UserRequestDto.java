package com.Dosinger.userservice.DTO;

import com.Dosinger.userservice.Enums.Gender;

import com.Dosinger.userservice.Enums.Role;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {

    String name;
    int age;
    String emailId;
    String mobile;
    Gender gender;
    Role role;

}