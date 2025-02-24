package com.yugao.dao.impl;

import com.yugao.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("BookDaoImpl constructor called ----");
    }

    public void save() {
        System.out.println("BookDaoImpl save called ----");
    }
}
