package com.yugao.service.impl;

import com.yugao.dao.BookDao;
import com.yugao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    // autowired 注入引用类型, 自动装配模式 默认按照类型进行装配
    @Autowired
    // qualifier 自动装配 bean 时按照 bean名称装配
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public void bookServiceSave() {
        System.out.println("BookServiceImpl bookServiceSave");
        bookDao.bookDaoSave();
    }
}
