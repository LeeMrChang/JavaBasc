package com.lee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @ClassName:JDBCTest
 * @Author：Mr.lee
 * @DATE：2019/12/21
 * @TIME： 12:34
 * @Description: TODO
 */
public class JDBCTest01 {
    public static void main(String[] args) throws Exception{
        //1、导入驱动jar
        //2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库连接对象
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_lian",
                "root",
                "root");
        //4、定义sql语句
        String sql = "update account set balance = 1000 where id=1";
        //5、获取执行sql的对象
        Statement statement = conn.createStatement();
        //6、执行sql
        int i = statement.executeUpdate(sql);
        //7、处理结果
        System.out.println(i);
        //8、释放资源
        statement.close();
        conn.close();
    }
}
