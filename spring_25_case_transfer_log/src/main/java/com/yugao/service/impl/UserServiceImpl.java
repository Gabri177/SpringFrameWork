package com.yugao.service.impl;

import com.yugao.domain.User;
import com.yugao.mapper.LogDao;
import com.yugao.mapper.UserDao;
import com.yugao.service.LogService;
import com.yugao.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private static final Log log = LogFactory.getLog(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    @Autowired
    private LogService logService;


    //rollback:设置当前事务参与回滚的异常，默认非运行时异常不参与回滚
//    @Transactional(rollbackFor = IOException.class)
    @Transactional
    @Override
    public void addAndUpdateUser(User user) {
        try {
            userDao.insert(user);
            System.out.println("insert success");
            User tempUser = new User();
            // 因为注明了这个方法是事务
            // 所以当下面的语句抛出异常后会回滚
            // 整个方法的操作会被撤销 也就是说上面的insert操作会被撤销
//        int a = 1/0;
            tempUser.setId(23);
            tempUser.setUsername("update3");
            tempUser.setPassword("update3");
            userDao.update(tempUser);
            System.out.println("update success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            logService.saveAddLog(user);
        }
    }
}
