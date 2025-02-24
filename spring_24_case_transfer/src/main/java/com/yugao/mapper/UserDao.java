package com.yugao.mapper;

import com.yugao.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {

    @Select("select * from user_info")
    public User findAll();
    @Select("select * from user_info where id=#{id}")
    public User findById(int id);
    @Insert("insert into user_info(username, password) values (#{username}, SHA1(#{password}))")
    public void insert(User user);
    @Update("update user_info set username=#{username}, password=SHA1(#{password}) where id = #{id}")
    public void update(User user);
    @Delete("delete from user_info where id=#{id}")
    public void delete(int id);
}
