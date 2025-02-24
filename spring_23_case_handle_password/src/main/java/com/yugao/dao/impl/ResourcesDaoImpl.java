package com.yugao.dao.impl;

import com.yugao.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository("resourcesDao")
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        //模拟校验
        return password.equals("root");
    }
}
