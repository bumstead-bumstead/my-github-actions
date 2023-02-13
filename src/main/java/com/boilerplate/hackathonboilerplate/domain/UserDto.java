package com.boilerplate.hackathonboilerplate.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UserDto {

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Info {
        private int id;
        private String name;
        private String password;
        private LocalDate birth;
    }

    @Getter
    @Setter
    public static class FindRequest {
        private String name;
    }
    @Getter
    @Setter
    public static class signUpRequest {
        private String name;
        private String password;
        private LocalDate birth;

        public User toEntity() {
            return User.builder().password(password).name(name).birth(birth).build();
        }
    }

    @Getter
    @Setter
    @Builder
    public static class signUpResponse {
        private String name;
        private Integer id;
        private LocalDateTime createdDate;
    }

    @Getter
    @AllArgsConstructor
    public static class Response {
        private Info info;
        private int returnCode;
        private String returnMessage;
    }
}

