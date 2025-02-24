package com.yugao.service;

import com.yugao.domain.User;

import java.util.List;

public interface UserService {
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(Integer id);
    public User getUserById(Integer id);
    public List<User> getAllUser();
}
