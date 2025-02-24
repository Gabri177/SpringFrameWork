package com.yugao.service;

import com.yugao.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
    User getUserById(Integer id);
    List<User> getAllUser();
}
