package com.yugao.service.impl;

import com.yugao.domain.User;
import com.yugao.mapper.UserDao;
import com.yugao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addAndUpdateUser(User user) {
        userDao.insert(user);
        System.out.println("insert success");
        User tempUser = new User();
        // 因为注明了这个方法是事务
        // 所以当下面的语句抛出异常后会回滚
        // 整个方法的操作会被撤销 也就是说上面的insert操作会被撤销
//        int a = 1/0;
        tempUser.setId(20);
        tempUser.setUsername("update1");
        tempUser.setPassword("update1");
        userDao.update(tempUser);
        System.out.println("update success");
    }
}
