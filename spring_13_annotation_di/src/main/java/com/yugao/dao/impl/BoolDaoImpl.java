package com.yugao.dao.impl;

import com.yugao.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BoolDaoImpl implements BookDao {

    //@Value("llllll")
    @Value("${name}")
    private String name;
    @Override
    public void bookDaoSave() {
        System.out.println("bookDaoimpl save" + name);
    }
}
