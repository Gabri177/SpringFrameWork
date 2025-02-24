package com.yugao.dao.impl;

import com.yugao.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Repository("bookDao")
//@Scope设置bean的作用范围
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDaoImpl save");
    }

    //@PostConstruct设置bean的初始化方法
    @PostConstruct
    public void init() {
        System.out.println("BookDaoImpl init");
    }

    //@PreDestroy设置bean的销毁方法
    @PreDestroy
    public void destroy() {
        System.out.println("BookDaoImpl destroy");
    }


}
