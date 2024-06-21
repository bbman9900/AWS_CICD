package com.cho.aws_cicd.controller;

import com.cho.aws_cicd.dto.UserCreateDTO;
import com.cho.aws_cicd.dto.UserResponseDTO;
import com.cho.aws_cicd.entity.User;
import com.cho.aws_cicd.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponseDTO> getUsers() {
        List<UserResponseDTO> users = userService.getUserList()
                .stream()
                .map(u -> new UserResponseDTO(u.getId(),u.getUserId(), u.getName()))
                .collect(Collectors.toList());
        return users;
    }

    @PostMapping("/users")
    public UserResponseDTO createNewUser(@RequestBody UserCreateDTO userDto){
        User user = userService.createUser(userDto);
        return new UserResponseDTO(user.getId(),user.getUserId(),user.getName());
    }
}
