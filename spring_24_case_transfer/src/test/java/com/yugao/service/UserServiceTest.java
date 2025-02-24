package com.yugao.service;

import com.yugao.config.SpringConfig;
import com.yugao.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void transactionTest(){
        User user = new User();
        user.setUsername("yugao66");
        user.setPassword("123456");
        userService.addAndUpdateUser(user);
        System.out.println("finish....");
    }
}
