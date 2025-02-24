package com.yugao.dao.impl;

import com.yugao.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionTimeout;

    public BookDaoImpl(String databaseName, int connectionTimeout) {
        this.databaseName = databaseName;
        this.connectionTimeout = connectionTimeout;
    }

    @Override
    public void bookSave() {
        System.out.println("bookdaoimpl booksave method was called ..." +
                "database name: " + databaseName +
                ", connection timeout: " + connectionTimeout
        );

    }
}
