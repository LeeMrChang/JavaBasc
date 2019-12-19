package com.lee.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName:ReflectTest
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 21:09
 * @Description: TODO
 */
public class ReflectTest {
    /**
     * 创建一个类似框架类，在不改动任何代码的情况下，灵活调用类
     * 体现反射的魅力
     * 需要配置 加 反射
     * @param args
     */
    public static void main(String[] args) throws Exception{
        //1、加载配置文件
        //1.1、创建Properties对象
        Properties pro = new Properties();
        //1.2、加载配置文件，转换为一个集合
        //1.3、获取class(src)目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        //2、调用加载配置文件的方法
        pro.load(is);
        //获取对象类名
        String className = pro.getProperty("className");
        //获取对象方法名
        String methodName = pro.getProperty("methodName");
        //3、加载该类进内存
        Class<?> aClass = Class.forName(className);
        //4、创建对象
        Object object = aClass.newInstance();
        //5、获取方法
        Method method = aClass.getMethod(methodName);
        //6、调用打印方法
        method.invoke(object);
    }
}
