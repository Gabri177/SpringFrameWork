package com.yugao;

import com.yugao.config.SpringConfig;
import com.yugao.dao.UserDao;
import com.yugao.domain.User;
import com.yugao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserService bean = context.getBean(UserService.class);
//        List<User> users = bean.getAllUser();
//        for (User user : users) {
//            System.out.println(user);
//        }

        UserDao userDao = (UserDao) context.getBean(UserDao.class);
        List<User> users = userDao.getAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
