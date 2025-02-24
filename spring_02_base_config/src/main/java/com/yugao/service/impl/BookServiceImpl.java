package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void saveBook() {
        System.out.println("BookServiceImpl saveBook method was called...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
