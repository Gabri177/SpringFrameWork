package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.dao.UserDao;
import com.yugao.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveBook() {
        System.out.println("BookServiceImpl.saveBook method called");
        bookDao.save();
        userDao.save();
    }
}
