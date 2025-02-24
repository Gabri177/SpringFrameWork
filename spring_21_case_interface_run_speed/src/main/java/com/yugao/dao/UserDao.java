package com.yugao.dao;

import com.yugao.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Insert("insert into user_info(username, password) values (#{username}, SHA1(#{password}))")
    public void insertUser(User user);
    @Update("update user_info set username = #{username}, password = SHA1(#{password}) where id = #{id}")
    public void updateUser(User user);
    @Delete("delete from user_info where id = #{id}")
    public void deleteUser(Integer id);
    @Select("select * from user_info where id = #{id}")
    public User getUserById(Integer id);
    @Select("select * from user_info")
    public List<User> getAllUser();
}
