package com.lee.reflect;

import com.lee.domain.Person;

import java.lang.reflect.Method;

/**
 * @ClassName:ReflectTest04
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 20:45
 * @Description: TODO
 */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
        //1、使用全类名获取Class对象
        Class<?> personClass = Class.forName("com.lee.domain.Person");
        Person person = new Person();
        //2、获取指定空参的方法
        Method eat = personClass.getMethod("eat");
        //invoke();  获取对象中的方法
        eat.invoke(person);
        //3、获取指定带参的方法
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person,"牛绒肉");
        //4、获取Class对象的所有方法，包括对象的父类方法，默认继承Object类
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method);
            //5、获取方法名称
            String name = method.getName();
            System.out.println(name);
            //6、获取Class对象的类名
            String name1 = personClass.getName();
            System.out.println(name1);
        }
    }
}
