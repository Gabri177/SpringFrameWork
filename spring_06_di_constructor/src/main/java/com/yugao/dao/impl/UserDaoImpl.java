package com.yugao.dao.impl;

import com.yugao.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void userSave() {
        System.out.println("userdaoimpl usersave method was called ...");
    }
}
