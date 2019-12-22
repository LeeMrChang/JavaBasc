package com.lee.test;

import com.lee.domain.Account;
import com.lee.uilts.JDBCUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:JDBCTemplateTest01
 * @Author：Mr.lee
 * @DATE：2019/12/22
 * @TIME： 13:27
 * @Description: TODO
 */
public class JDBCTemplateTest01 {

    private JdbcTemplate template;

    @Before
    public void init() {
        System.out.println("每次都在所有方法执行之前执行....");
        template = new JdbcTemplate(JDBCUtil.getDataSource());
    }

    @After
    public void destroy() {
        //写在After注解方法里面的代码，会在执行完测试方法之后调用
        System.out.println("测试方法执行完毕。。。");
    }

    @Test
    public void test01() {
        //测试添加数据
        String sql = "insert into account values (null,?,?)";
        //使用JdbcTemplate执行添加数据的SQL语句
        //2.调用update()方法，执行添加数据的SQL语句
        int i = template.update(sql, "fcq","888");
        System.out.println(i);
    }

    @Test
    public void testUpdate(){
        //测试修改数据
        String sql = "update account set name =? where id=?";
        //2.调用update()方法，执行SQL语句
        template.update(sql,"张三丰",5);
    }
    @Test
    public void testDelete(){
        System.out.println("执行测试方法....");
        //测试执行删除数据的SQL语句
        String sql = "delete from account where id=?";
        template.update(sql,5);
    }

    @Test
    public void testQueryOne(){
        //测试查询单个数据
        //查询圣枪游侠的id
        //String sql = "select id from account where name=?";
        //调用方法查询
        //如果要使用queryForObject()方法查询单个数据，你必须得指定这个数据的类型
        //Integer id = template.queryForObject(sql, Integer.class, "王五");
        //System.out.println(id);
        //查询id为4的用户的nickname
        String sql = "select name from account where id=?";
        String nickname = template.queryForObject(sql, String.class, 4);
        System.out.println(nickname);
    }

    @Test
    public void testQueryObeRow(){
        //使用JdbcTemplate方法，查询一行数据
        //将这一行数据查询出来，封装到什么里面?---1.可以封装到Map中
        String sql = "select * from account where id=?";
        //查询一行数据，并且将这一行结果封装到map对象里面
        Map<String, Object> map = template.queryForMap(sql, 4);
        System.out.println(map);
    }

    @Test
    public void testQueryOneRowForBean(){
        //查询一行数据封装到javaBean对象
        String sql = "select * from account where id=?";
        //调用queryForObject()方法
        Account account1 = template.queryForObject(sql, (ResultSet resultSet,int i)-> {
                //这个方法里面就进行结果集的映射
                Account account = new Account();
                int id = resultSet.getInt("id");
                account.setId(id);

                String name = resultSet.getString("name");
                account.setName(name);

                String balance = resultSet.getString("balance");
                account.setBalance(balance);

                return account;
        }, 4);

        System.out.println(account1);
    }

    @Test
    public void testQueryForOneRow2(){
        //很重要
        //使用queryForObject()方法，查询一条数据并且将这一条数据封装到JavaBean对象中
        String sql = "select * from account where id=?";
        Account account = template.queryForObject(sql,
                new BeanPropertyRowMapper<>(Account.class), 4);
        System.out.println(account);
    }
    @Test
    public void testQueryOneColumn(){
        //查询一列数据，要查询所有用户的nickname
        String sql = "select name from account";
        //查询一列数据封装到一个集合中
        List<String> nicknames = template.queryForList(sql, String.class);
        System.out.println(nicknames);
    }

    @Test
    public void testQueryRows(){
        //查询多行数据
        //返回值是List<Map<String,Object>>
        String sql = "select * from account where id>?";
        List<Map<String, Object>> maps = template.queryForList(sql, 1);

        System.out.println(maps);
    }

    @Test
    public void testQueryRows2(){
        //查询多行数据
        //很重要
        //返回值是List<Bean>
        String sql = "select * from account where id>?";
        List<Account> users = template.query(sql, new BeanPropertyRowMapper<>(Account.class), 1);

        System.out.println(users);
    }
}
