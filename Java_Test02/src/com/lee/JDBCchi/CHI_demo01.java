package com.lee.JDBCchi;

import com.lee.domain.Person;

import javax.sql.ConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * @ClassName:CHI_demo01
 * @Author：Mr.lee
 * @DATE：2019/12/22
 * @TIME： 10:03
 * @Description: TODO
 */
public class CHI_demo01 {
    //声明一个容器对象
    private LinkedList<Connection> connections = new LinkedList<>();
    //空参构造
    public CHI_demo01() {

        try {
            for (int i = 0; i < 5; i++) {
                Connection conn = DriverManager.getConnection("jdbc:mysql:///db_lian", "root", "root");
                connections.add(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
