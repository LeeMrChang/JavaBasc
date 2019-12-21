package com.lee.jdbc;

import com.lee.utils.JDBCUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @ClassName:LoginTest
 * @Author：Mr.lee
 * @DATE：2019/12/21
 * @TIME： 16:11
 * @Description: TODO
 */
public class LoginTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名称：");
        String username = sc.nextLine();
        System.out.println("请输入您的密码：");
        String password = sc.nextLine();
        //调用登录方法
        boolean login = login(username, password);
        if(login){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！");
        }

    }
    /**
     * 用户登录方法
     * @param username
     * @param password
     * @return
     */
    public static boolean login(String username,String password){
        Connection conn = null;
        Statement statement = null;
        ResultSet res = null;
        try {
            //1、获取数据库连接对象
            conn = JDBCUtil.getConn();
            //2、定义sql语句
            String sql = "select * from user where username='"
                    +username+"'and password='"+password+"'";
            //3、获取执行sql对象
            statement = conn.createStatement();
            //4、执行sql
            res = statement.executeQuery(sql);
            //5、处理结果集 如果输入正确返回true
            return res.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,statement,res);
        }
        return false;
    }

    /**
     * 用户登录方法
     * @param username
     * @param password
     * @return
     */
    public static boolean login2(String username,String password){
        Connection conn = null;
        PreparedStatement pre  = null;
        ResultSet res = null;
        try {
            //1、获取数据库连接对象
            conn = JDBCUtil.getConn();
            //2、定义sql语句
            String sql = "select * from user where username=? and password= ?";

            //3、获取执行sql对象
            pre = conn.prepareStatement(sql);
            //4、执行sql
            pre.setString(1,username);
            pre.setString(2,password);
            res = pre.executeQuery();
            //5、处理结果集 如果输入正确返回true
            return res.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,pre,res);
        }
        return false;
    }
}
