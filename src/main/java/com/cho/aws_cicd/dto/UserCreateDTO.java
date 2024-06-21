package com.cho.aws_cicd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateDTO {
    private String userId;
    private String password;
    private String name;
    private String email;
}
