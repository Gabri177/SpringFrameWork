package com.yugao.dao;

import com.yugao.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Insert("insert into user_info(username, password) values (#{username}, SHA1(#{password}))")
    void save(User user);

    @Delete("delete from user_info where id = #{id}")
    void deleteById(Integer id);

    @Update("update user_info set username = #{username}, password = SHA1(#{password}) where id = #{id}")
    void update(User user);

    @Select("select * from user_info")
    List<User> findAll();

    @Select("select * from user_info where id = #{id}")
    User findById(Integer id);

}
