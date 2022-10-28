package com.springboot.hello.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRegisterPostReq {
    private String id;
    private String name;
    private String password;
}
