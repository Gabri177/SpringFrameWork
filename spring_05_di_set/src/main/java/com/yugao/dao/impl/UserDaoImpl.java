package com.yugao.dao.impl;

import com.yugao.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userdaoimpl save method called");
    }
}
