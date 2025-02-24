package com.yugao.service.impl;

import com.yugao.domain.User;
import com.yugao.mapper.LogDao;
import com.yugao.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    //propagation设置事务属性：传播行为设置为当前操作需要新事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void saveAddLog(User user) {
        logDao.log("新创建了user: " + user.getUsername());
        System.out.println("add log success");
    }
}
