package com.lee.jdbc;

import java.sql.*;

/**
 * @ClassName:JDBCTest02
 * @Author：Mr.lee
 * @DATE：2019/12/21
 * @TIME： 14:50
 * @Description: TODO
 */
public class JDBCTest05 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取数据库连接对象
            connection = DriverManager.getConnection(
                    "jdbc:mysql:///db_lian",
                    "root",
                    "root");
            //3、定义sql
            String sql = "select * from account";
            //4、获取执行sql的对象
            statement = connection.createStatement();
            //5、执行sql
            resultSet = statement.executeQuery(sql);
            //6、处理结果集
            //6.1获取下一行的额数据
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                System.out.println(id+"---"+name+"---"+balance);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            if (resultSet!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
