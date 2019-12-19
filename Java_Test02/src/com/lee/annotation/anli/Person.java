package com.lee.annotation.anli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName:Person
 * @Author：Mr.lee
 * @DATE：2019/12/19
 * @TIME： 16:39
 * @Description: TODO
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Person {
    //定义注解的属性，注解都是用来替代配置文件的
    String className();
    String methodName();
}
