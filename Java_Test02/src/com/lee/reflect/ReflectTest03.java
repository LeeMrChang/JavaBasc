package com.lee.reflect;

import com.lee.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @ClassName:ReflectTest03
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 20:30
 * @Description: TODO
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //1、使用对象.getClass();获取Class对象
        Class<? extends Person> personClass = new Person().getClass();
        //2、获取空参构造
        Constructor<? extends Person> constructor = personClass.getConstructor();
        //public com.lee.domain.Person()
        System.out.println(constructor);
        //3、获取带参构造
        Constructor<? extends Person> constructor1 = personClass.getConstructor(String.class, int.class);
        //public com.lee.domain.Person(java.lang.String,int)
        System.out.println(constructor1);
        //4、使用空参构造创建对象
        Person person = constructor.newInstance();
        //Person{name='null', age=0}
        System.out.println(person);
        //5、根据.newInstance();创建对象的方法,可直接使用Class对象.newInstance();创建对象
        Person person1 = personClass.newInstance();
        System.out.println(person1);
    }
}
