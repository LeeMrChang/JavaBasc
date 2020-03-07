package com.lee.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * 包名:com.itheima.utils
 * 作者:Leevi
 * 日期2019-05-10  17:51
 */
public class JedisUtil {
    private static JedisPool jedisPool;
    private static String host;
    private static int port;
    private static int maxTotal;
    private static int maxIdle;
    private static int maxWaitMillis;
    static {
        //首先从配置文件中读取数据
        ResourceBundle bundle = ResourceBundle.getBundle("jedisinfo");
        host = bundle.getString("host");
        port = Integer.parseInt(bundle.getString("port"));
        maxTotal = Integer.parseInt(bundle.getString("maxTotal"));
        maxIdle = Integer.parseInt(bundle.getString("maxIdle"));
        maxWaitMillis = Integer.parseInt(bundle.getString("maxWaitMillis"));

        //1.创建连接池对象
        JedisPoolConfig poolConfig = new JedisPoolConfig();//这个对象是给jedis连接池配置信息的
        poolConfig.setMaxTotal(maxTotal);//设置最大连接数
        poolConfig.setMaxIdle(maxIdle);//设置最大闲置连接数
        poolConfig.setMaxWaitMillis(maxWaitMillis);//设置最大等待时间

        //1.创建一个连接池对象
        jedisPool = new JedisPool(poolConfig, host, port);
    }

    /**
     * 从连接池获取连接
     *
     * @return
     */
    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
