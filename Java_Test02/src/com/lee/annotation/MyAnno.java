package com.lee.annotation;

/**
 * @ClassName:MyAnno
 * @Author：Mr.lee
 * @DATE：2019/12/19
 * @TIME： 15:51
 * @Description: TODO
 */
public @interface MyAnno {
    //自定义注解
    //定义属性列表，可以有
    //基本类型、String、枚举、注解、以上类型的数组
    int age();
//    String name() default "啊兴";
//    //定义枚举类
//    Person per();
//    //定义注解类型
//    MyAnno2 address();
//    int[] arr();
//    String[] array();
//    MyAnno2[] MY_ANNO_2_S();
}
