package com.yugao.dao.impl;

import com.yugao.dao.BookDao;

public class BookDaoImpl implements BookDao {


    @Override
    public void save() {
        System.out.println("BookDaoImpl.save method was called ...");
    }
}
