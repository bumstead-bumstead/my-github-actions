package com.boilerplate.hackathonboilerplate.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class UserDto {

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Info {
        private int id;
        private String name;
        private int age;
    }

    @Getter
    @Setter
    public static class Request {
        private String name;
        private int age;
    }

    @Getter
    @AllArgsConstructor
    public static class Response {
        private Info info;
        private int returnCode;
        private String returnMessage;
    }
}

