package com.cho.aws_cicd.service;


import com.cho.aws_cicd.dto.UserCreateDTO;
import com.cho.aws_cicd.entity.User;
import com.cho.aws_cicd.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User createUser(UserCreateDTO userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        return userRepository.save(user);
    }
}
