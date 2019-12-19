package com.lee.reflect;

import com.lee.domain.Person;

/**
 * @ClassName:reflect
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 19:46
 * @Description: TODO
 */
public class ReflectTest01 {

    public static void main(String[] args) throws Exception {
        //1、Class.forName("全类名"):将字节码文件加载进内存，返回Class对象
        //多用于配置文件，将类名定义在配置文件中。读取文件，加载类
        Class<?> aClass = Class.forName("com.lee.domain.Person");
        System.out.println(aClass);
        //2、类名.Class：通过类名的属性class获取，多用于参数的传递
        Class<Person> aClass1 = Person.class;
        System.out.println(aClass1);
        //3、对象.getClass();  Object类中定义着getClass();
        //多用于对象的获取字节码的方式
        Class<? extends Person> aClass2 = new Person().getClass();
        System.out.println(aClass2);
        System.out.println(aClass==aClass1);
        System.out.println(aClass==aClass2);
    }
}
