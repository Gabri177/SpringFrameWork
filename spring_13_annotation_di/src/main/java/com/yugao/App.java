package com.yugao;

import com.yugao.config.SpringConfig;
import com.yugao.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class App {
    public static void main(String[] args) {
        ApplicationContext atx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bean = atx.getBean(BookService.class);
        bean.bookServiceSave();

    }
}
