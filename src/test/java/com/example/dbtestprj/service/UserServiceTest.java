package com.example.dbtestprj.service;

import com.example.dbtestprj.model.User;
import com.example.dbtestprj.repository.UserRepository;
import com.example.dbtestprj.service.implementation.UserServiceInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServiceInterface userService;

    @Test
    void getUser() {

        User user = User.builder().userId(1L).build();
        userService.saveUser(user);

        List<User> foundUsers = userRepository.findAll();
    }
}