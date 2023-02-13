package com.boilerplate.hackathonboilerplate.service;


import com.boilerplate.hackathonboilerplate.domain.User;
import com.boilerplate.hackathonboilerplate.domain.UserDto;
import com.boilerplate.hackathonboilerplate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDto.signUpResponse signUp(UserDto.signUpRequest userDto) {
        User user = userDto.toEntity();
        user.setCreatedDate(LocalDateTime.now());
        User savedUser = userRepository.save(user);

        return UserDto.signUpResponse.builder()
                .id(savedUser.getId())
                .createdDate(savedUser.getCreatedDate())
                .name(savedUser.getName()).build();
    }
}
