package com.yugao.dao.impl;

import com.yugao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String password) {
        System.out.println("id:" + id + " password:" + password);
//        if (true)
//            throw new NullPointerException();
        return "this is a test";
    }
}
