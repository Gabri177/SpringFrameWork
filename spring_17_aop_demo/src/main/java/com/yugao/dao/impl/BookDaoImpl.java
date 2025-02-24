package com.yugao.dao.impl;

import com.yugao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDaoImpl save");
    }

    @Override
    public void update() {
        System.out.println("BookDaoImpl update");
    }

    @Override
    public void delete() {
        System.out.println("BookDaoImpl delete");
    }

    @Override
    public void select() {
        System.out.println("BookDaoImpl select");
    }
}
