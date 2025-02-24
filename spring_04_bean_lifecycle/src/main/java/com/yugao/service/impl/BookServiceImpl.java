package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("book service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("book service init");
    }

    @Override
    public void save() {
        System.out.println("BookServiceImpl.save method called");
        bookDao.save();
    }
}
