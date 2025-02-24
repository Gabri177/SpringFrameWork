package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.service.BookService;

public class BookServiceImpl implements BookService {

//  这里我们无需提供实例, spring会通过反射 根据xml文件中的配置信息
//  给出对应的Dao实例 但是我们要注意 这里应该给出set方法
//  随着后面的学习 不给也可以 sping会通过暴力反射的方式给出对应的Dao实例对象
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("Book service save method was called ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
