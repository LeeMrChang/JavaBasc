package com.lee.jedis;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.lee.domain.User;
import com.lee.utils.JedisUtil;


import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


import java.util.*;

/**
 * 包名:com.itheima.jedis
 * 作者:Leevi
 * 日期2019-05-10  17:37
 */
public class TestJedis {
    @Test
    public void test01(){
        //使用Jedis往redis服务器中存放一个字符串
        //1.获得连接对象
        String host = "localhost";
        int port = 6379;
        Jedis jedis = new Jedis(host,port);

        //2.调用方法往redis服务器中存放数据
        jedis.set("username","aobama");

        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test02(){
        //使用jedis获取redis服务器中的数据
        //1.创建连接
        Jedis jedis = new Jedis("localhost", 6379);
        //2.调用get()根据key获取value
        String username = jedis.get("username");
        System.out.println(username);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test03(){
        //使用连接池操作jedis的连接
        String host = "localhost";
        int port = 6379;
        JedisPoolConfig poolConfig = new JedisPoolConfig();//这个对象是给jedis连接池配置信息的
        poolConfig.setMaxTotal(12);//设置最大连接数
        poolConfig.setMaxIdle(12);//设置最大闲置连接数
        poolConfig.setMaxWaitMillis(3000);//设置最大等待时间

        //1.创建一个连接池对象
        JedisPool pool = new JedisPool(poolConfig,host,port);

        //2.从连接池里面获取连接对象
        Jedis jedis = pool.getResource();

        //3.调用jedis的方法，获取username
        String username = jedis.get("username");
        System.out.println(username);

        //4.将连接归还到连接池
        jedis.close();
    }

    @Test
    public void test04(){
        //从连接池中，获取连接对象，并且操作redis数据库
        Jedis jedis = JedisUtil.getJedis();

        jedis.set("nickname","周杰棍");

        //归还连接
        jedis.close();
    }
    @Test
    public void test05(){
        User user = new User(1, "jay", "666666", "周杰棍", "中国台湾省台北市");
        //将user对象中的数据存放到redis服务器中
        //使用hash类型进行存储
        Jedis jedis = JedisUtil.getJedis();
        Map<String,String> map = new HashMap<>();
        //将user中的数据存放到map中
        map.put("username",user.getUsername());
        map.put("id",user.getId()+"");
        map.put("password",user.getPassword());
        map.put("nickname",user.getNickname());
        map.put("address",user.getAddress());

        jedis.hmset("p1",map);

        //关闭连接

        jedis.close();
    }
    @Test
    public void test06(){
        //获取redis中存放的用户信息
        Jedis jedis = JedisUtil.getJedis();

        List<String> strs = jedis.hmget("p1", "username", "id", "password", "nickname", "address");

        //将数据封装到User对象中----->无法做到

    }
    @Test
    public void test07(){
        //一般，将对象中的数据存放到redis中，我们会先将该对象转换成json字符串，然后再将json字符串存入到redis服务器
        User user = new User(1, "jay", "666666", "周杰棍", "中国台湾省台北市");

        //将user对象转换成json字符串
        //使用gson框架
        Gson gson = new Gson();
        String jsonStr = gson.toJson(user);

        //将json字符串存放到redis中
        Jedis jedis = JedisUtil.getJedis();
        jedis.set("s1",jsonStr);

        jedis.close();
    }

    @Test
    public void test08(){
        //获取redis中存放的用户信息，并且再将其封装到user对象
        Jedis jedis = JedisUtil.getJedis();
        String jsonStr = jedis.get("s1");

        //使用Gson将json字符串，转换成对象:原理是用的反射
        Gson gson = new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        System.out.println(user.getNickname());
    }

    @Test
    public void test10(){
        //往redis中存放一个JavaBean的集合
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "jay1", "6666661", "周杰棍1", "中国台湾省台北市1");
        User user2 = new User(2, "jay2", "6666662", "周杰棍2", "中国台湾省台北市2");
        User user3 = new User(3, "jay3", "6666663", "周杰棍3", "中国台湾省台北市3");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        //将users集合转换成json字符串
        Gson gson = new Gson();
        String jsonStr = gson.toJson(users);

        //将jsonStr存放到redis服务器中
        Jedis jedis = JedisUtil.getJedis();
        jedis.set("users",jsonStr);

        jedis.close();
    }

    @Test
    public void test11(){
        //获取redis中存放的用户集合，转换成List<User>
        Jedis jedis = JedisUtil.getJedis();
        String jsonStr = jedis.get("users");

        //将jsonStr转换成List<User>
        Gson gson = new Gson();

        List<User> users = gson.fromJson(jsonStr, new TypeToken<List<User>>() {
        }.getType());

        for (User user : users) {
            System.out.println(user.getNickname());
        }
    }
}
