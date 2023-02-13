package com.boilerplate.hackathonboilerplate.controller;


import com.boilerplate.hackathonboilerplate.domain.UserDto;
import com.boilerplate.hackathonboilerplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/register")
    public UserDto.signUpResponse register(UserDto.signUpRequest signUpRequest) {
        System.out.println("바듬");
        UserDto.signUpResponse result = userService.signUp(signUpRequest);

        return result;
    }
}
