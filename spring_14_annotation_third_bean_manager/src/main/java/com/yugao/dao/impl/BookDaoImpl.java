package com.yugao.dao.impl;

import com.yugao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Override
    public void bookDaoSave() {
        System.out.println("bookdaoimpl bookdaosave method called");
    }
}
