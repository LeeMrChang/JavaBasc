package com.lee.control;

import com.lee.domain.User;
import com.lee.uitls.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName:Client
 * @Author：Mr.lee
 * @DATE：2019/12/22
 * @TIME： 10:58
 * @Description: TODO
 */
public class Client {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            //1、获取连接对象
            conn = JDBCUtil.getConnection();
            //2、定义sql
            String sql = "select * from user where username = ? and password = ?";
            //3、获取执行查询sql对象
            statement = conn.prepareStatement(sql);
            //设置？占位符的参数值
            statement.setObject(1,"zhangsan");
            statement.setObject(2,"123");
            //4、处理sql结果集
            resultSet = statement.executeQuery();
            User user = null;
            while ( resultSet.next()){
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                //5、将数据封装到JavaBean中
                user = new User();
                user.setId(id);
                user.setUsername(username);
                user.setPassword(password);
            }
            //6、打印javaBean
            System.out.println(user);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7、释放资源
            try {
                JDBCUtil.close(conn,statement,resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test01() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        Connection connection1 = JDBCUtil.getConnection();
        Connection connection2 = JDBCUtil.getConnection();
        Connection connection3 = JDBCUtil.getConnection();
        Connection connection4 = JDBCUtil.getConnection();
        System.out.println(connection);
        System.out.println(connection1);
        System.out.println(connection2);
    }
}
