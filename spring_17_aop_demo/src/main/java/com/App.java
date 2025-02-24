package com;

import com.yugao.config.SpringConfig;
import com.yugao.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = (BookDao) context.getBean(BookDao.class);
        bean.save();
    }
}
