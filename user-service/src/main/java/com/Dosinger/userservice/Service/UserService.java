package com.Dosinger.userservice.Service;

import com.Dosinger.userservice.DTO.UserRequestDto;
import com.Dosinger.userservice.DTO.UserResponseDto;

public interface UserService {
    public UserResponseDto addUser(UserRequestDto requestDto);
}
