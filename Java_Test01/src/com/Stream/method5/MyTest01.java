package com.Stream.method5;

/**
 * @ClassName:MyTest01
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 20:28
 * @Description: TODO
 */
public class MyTest01 {
    public static void fanPerson(String name,FanPerson fan){
        Person method = fan.method(name);
        System.out.println(method);
    }

    public static void main(String[] args) {
//        new MyTest01().fanPerson("李浩",(name)->new Person(name));
//        new MyTest01().fanPerson("离线",Person::new);
        fanPerson("李浩",(name)->new Person(name));
        fanPerson("离线",Person::new);
    }
}
