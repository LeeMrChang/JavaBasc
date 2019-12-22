package com.lee.jdbc;

import com.lee.utils.JDBCUtil;
import org.junit.Test;

import java.sql.*;

/**
 * @ClassName:JDBCTest07
 * @Author：Mr.lee
 * @DATE：2019/12/22
 * @TIME： 9:32
 * @Description: TODO
 */
public class JDBCTest07 {
    /**
     * 获取JDBC元数据
     *
     * @param args
     */
    public static void main(String[] args) throws SQLException {

        //1、获取数据库连接对象
        Connection conn = JDBCUtil.getConn();
        //2、获取元数据对象
        DatabaseMetaData metaData = conn.getMetaData();
        //3、可分别获取到连接数据库的配置文件信息
        String url = metaData.getURL();
        String userName = metaData.getUserName();
        System.out.println(url + "----" + userName);
        conn.close();
    }

    @Test
    public void test01() throws SQLException {
        Connection conn = JDBCUtil.getConn();
        String sql = "select * from account";
        //元数据处理sql对象
        PreparedStatement statement = conn.prepareStatement(sql);
        //获取元数据对象
        ParameterMetaData data = statement.getParameterMetaData();
        int count = data.getParameterCount();
        for (int i = 0; i < count; i++) {
            int type = data.getParameterType(i);
            System.out.println(type);
        }
    }
}
