package com.yugao.service;

import com.yugao.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

//    @Transactional
    public void addAndUpdateUser(User user);
}
