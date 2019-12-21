package com.lee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName:JDBCTest02
 * @Author：Mr.lee
 * @DATE：2019/12/21
 * @TIME： 14:50
 * @Description: TODO
 */
public class JDBCTest04 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取数据库连接对象
            connection = DriverManager.getConnection(
                    "jdbc:mysql:///db_lian",
                    "root",
                    "root");
            //3、定义sql
            String sql = "delete from account where id=3";
            //4、获取执行sql的对象
            statement = connection.createStatement();
            //5、执行sql
            int count = statement.executeUpdate(sql);
            System.out.println(count);
            //6、处理结果集
            if (count > 0) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
