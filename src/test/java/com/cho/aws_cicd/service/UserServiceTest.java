package com.cho.aws_cicd.service;

import com.cho.aws_cicd.dto.UserCreateDTO;
import com.cho.aws_cicd.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Transactional
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void 사용자생성테스트(){
        //given
        UserCreateDTO userDto = new UserCreateDTO("aaa", "1111", "홍길동", "a@naver.com");
        //when
        User user = userService.createUser(userDto);
        //then
        assertThat(user.getId()).isGreaterThan(0);
    }
}