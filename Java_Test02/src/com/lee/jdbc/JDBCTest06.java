package com.lee.jdbc;

import com.lee.domain.Dept;
import com.lee.utils.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:JDBCTest02
 * @Author：Mr.lee
 * @DATE：2019/12/21
 * @TIME： 14:50
 * @Description: TODO
 */
public class JDBCTest06 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        ResultSet res = null;
        try {
            conn = JDBCUtil.getConn();
            //3、定义sql
            String sql = "select * from dept";
            //4、获取执行sql的对象
            statement = conn.createStatement();
            //5、执行sql
            res = statement.executeQuery(sql);
            //6、处理结果集
            List<Dept> list = new ArrayList<>();
            Dept dept = null;
            while (res.next()) {
                int id = res.getInt("id");
                String dname = res.getString("dname");
                String loc = res.getString("loc");
                dept = new Dept();
                dept.setId(id);
                dept.setDname(dname);
                dept.setLoc(loc);
                list.add(dept);
            }
            for (Dept dept1 : list) {
                System.out.println(dept1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
           JDBCUtil.close(conn,statement,res);
        }
    }
}
