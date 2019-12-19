package com.io;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName:PropertiesTest01
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:37
 * @Description: TODO
 */
public class PropertiesTest01 {

    public static void main(String[] args) {

        Properties properties = new Properties();
        //setProperty  设置key与value的方法
        properties.setProperty("姚明","226");
        properties.setProperty("奥尼尔","218");
        properties.setProperty("詹姆斯","203");
        properties.setProperty("科比","197");
        //getProperty根据key获取value的方法
        System.out.println(properties.getProperty("姚明"));
        //遍历的方法stringPropertyNames();
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
