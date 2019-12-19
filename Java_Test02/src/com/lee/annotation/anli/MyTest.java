package com.lee.annotation.anli;

/**
 * @ClassName:MyTest
 * @Author：Mr.lee
 * @DATE：2019/12/19
 * @TIME： 16:55
 * @Description: TODO
 */

import java.lang.reflect.Method;

/**
 * 指定自定义注解中定义的属性
 * className = "com.lee.annotation.anli.DomeOne" 类似配置文件中定义灵活的对象名
 * methodName = "show"  配置文件中定义灵活的属性名
 */
@Person(className = "com.lee.annotation.anli.DomeOne",methodName = "show")
public class MyTest {
    public static void main(String[] args) throws Exception {
        //1、根据本类名获取Class对象
        Class<MyTest> myTestClass = MyTest.class;
        //2、根据Class对象获取注解对象  Person.class获取Class对象
        Person annotation = myTestClass.getAnnotation(Person.class);
        //3、获取注解对象中的属性
        String className = annotation.className();
        String methodName = annotation.methodName();
        //4、根据Class.forName获取Class对象
        Class<?> aClass = Class.forName(className);
        //5、根据Class对象获取对象  根据Class的空参构造创建对象
        Object object = aClass.newInstance();
        //6、根据Class对象获取属性
        Method method = aClass.getMethod(methodName);
        //7、调用打印方法
        method.invoke(object);
    }
}
