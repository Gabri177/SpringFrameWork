package com.yugao.service;

import com.alibaba.druid.support.logging.Log;
import com.yugao.domain.User;

public interface LogService {
    void saveAddLog(User user);
}
