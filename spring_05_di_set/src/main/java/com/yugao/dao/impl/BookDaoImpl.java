package com.yugao.dao.impl;

import com.yugao.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String databaseName;
    private int connectionTimeout;

    // 上面我们定义了两个私有变量 并提供了set方法 用于注入
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    @Override
    public void save() {
        System.out.println("bookdaoimpl save method called and connectionTimeout is " + connectionTimeout +
                " and databaseName is " + databaseName);
    }
}
