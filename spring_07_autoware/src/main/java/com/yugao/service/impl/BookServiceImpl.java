package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void bookServiceSave() {
        System.out.println("bookServiceSave method invoked");
        bookDao.bookDaoSave();
    }
}
