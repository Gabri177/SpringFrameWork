package com.yugao.factory;

import com.yugao.dao.UserDao;
import com.yugao.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
