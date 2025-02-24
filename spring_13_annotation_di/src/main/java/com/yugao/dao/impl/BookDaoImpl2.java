package com.yugao.dao.impl;

import com.yugao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void bookDaoSave() {
        System.out.println("BookDaoImpl2 save");
    }
}
