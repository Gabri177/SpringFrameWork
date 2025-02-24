package com.yugao;

import com.yugao.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entry {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService testService2 = (BookService) context.getBean("testService2");
        testService2.saveBook();

    }
}
