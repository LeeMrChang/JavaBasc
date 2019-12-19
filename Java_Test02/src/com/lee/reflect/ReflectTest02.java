package com.lee.reflect;

import com.lee.domain.Person;

import java.lang.reflect.Field;

/**
 * @ClassName:ReflectTest02
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 20:06
 * @Description: TODO
 */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception{
        //1、使用类名获取Class对象
        Class<Person> personClass = Person.class;
        //2、获取以public修饰符修饰的成员变量们
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //3、获取指定的成员变量
        Field name = personClass.getField("username");
        Person person = new Person();
        //4、获取成员变量name的值
        Object object = name.get(person);
        System.out.println(object);
        //5、设置成员变量name的值
        name.set(person,"邓哈比");
        System.out.println(person);
        //6、获取无视任何修饰符修饰的成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        //7、获取无视任何修饰符修饰指定的成员变量
        Field name1 = personClass.getDeclaredField("name");
        //name是private修饰的，不能直接访问安全权限修饰的变量，需要暴力反射
        //8、忽略安全权限修饰的安全检查
        name1.setAccessible(true);
        Object value = name1.get(person);
        System.out.println(value);
    }
}
