package com.yugao.service;

import com.yugao.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//设置类运行器

//@RunWith(SpringJUnit4ClassRunner.class) // junit4的方案是这样
@ExtendWith(SpringExtension.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    //支持自动装配注入bean
    @Autowired
    private UserService userService;

    @Test
    public void testFindById(){
        System.out.println(userService.getUserById(4));

    }

    @Test
    public void testFindAll(){
        System.out.println(userService.getAllUser());
    }


}
