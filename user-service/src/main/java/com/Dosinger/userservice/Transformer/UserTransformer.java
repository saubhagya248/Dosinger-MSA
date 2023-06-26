package com.Dosinger.userservice.Transformer;

import com.Dosinger.userservice.DTO.UserRequestDto;
import com.Dosinger.userservice.DTO.UserResponseDto;
import com.Dosinger.userservice.Model.User;

public class UserTransformer{
    public static User UserRequestDtoToUser(UserRequestDto requestDto){
        return User.builder()
        .name(requestDto.getName())
        .age(requestDto.getAge())
        .email(requestDto.getEmailId())
        .gender(requestDto.getGender())
        .mobile(requestDto.getMobile())
        .password(requestDto.getPassword())
        .build();
    }

    public static UserResponseDto UserToUserResponseDto(User user){
        return UserResponseDto.builder()
        .email(user.getEmail())
        .mobile(user.getMobile())
        .name(user.getName())
        .message("Name :"+user.getName())
        .build();
    }
}