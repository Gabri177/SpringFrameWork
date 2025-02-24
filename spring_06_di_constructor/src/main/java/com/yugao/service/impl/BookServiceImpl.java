package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.dao.UserDao;
import com.yugao.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void bookServiceSave() {
        System.out.println("bookServiceSave method was called");
        bookDao.bookSave();
        userDao.userSave();
    }
}
