package com.yugao.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.yugao.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("com.mysql.cj.jdbc.Driver")
    private String driverClassName;
    @Value("jdbc:mysql://localhost:3306/gyh01")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
