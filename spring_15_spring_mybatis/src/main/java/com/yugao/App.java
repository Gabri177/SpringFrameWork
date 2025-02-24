package com.yugao;

import com.yugao.config.SpringConfig;
import com.yugao.domain.User;
import com.yugao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) context.getBean(UserService.class);
//        User user1 = new User();
//        user1.setId(1);
//        user1.setUsername("yugao");
//        user1.setPassword("123456");
//        userService.addUser(user1);
        User user = userService.getUserById(4);
        List<User> users = userService.getAllUser();
        System.out.println(user);

        for (User user1 : users) {
            System.out.println(user1);
        }

    }
}
