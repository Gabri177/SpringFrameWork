package com.yugao.mapper;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {

    @Insert("insert into user_log values (#{info}, now())")
    void log(String info);
}
