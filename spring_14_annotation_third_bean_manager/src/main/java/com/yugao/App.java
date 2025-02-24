package com.yugao;

import com.yugao.config.SpringConfig;
import com.yugao.dao.BookDao;
import com.yugao.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.io.ObjectInputFilter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println(ds);

        Connection conn = ds.getConnection();
        Statement statement = conn.createStatement();
        String sql = "select * from user_info";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
        resultSet.close();
        statement.close();
        conn.close();
    }
}
