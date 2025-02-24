package com.yugao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//初始化BeanFactory
public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resources = new ClassPathResource("applicationContext.xml");
//        BookDao bookDao = bf.getBean(BookDao.class);
//        bookDao.save();
    }
}
