package com.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @ClassName:StreamTest04
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 19:06
 * @Description: TODO
 */
public class StreamTest04 {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //1、取名字为3个字的成员存到一个新集合中
       /* Stream<String> stream = one.stream();
        Stream<String> stream1 = stream.filter((name) -> name.length() == 3);*/
        //2、取筛选后集合的前3个元素
        Stream<String> stream1 = one.stream().filter((name -> name.length() == 3)).limit(3);
        /*Stream<String> stream2 = stream1.limit(3);*/
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        //3、只要姓“张” 的成员，存到一个新集合
        /*Stream<String> stream3 = two.stream();
        Stream<String> stream4 = stream3.filter(name -> name.startsWith("张"));*/
        //4、筛选替我two1集合中的不要前2个元素，存到一个集合
        /*Stream<String> stream5 = stream4.skip(2);*/
        Stream<String> stream2 = two.stream().filter((name) -> name.startsWith("张")).skip(2);
        //5、将两个集合整合为一个集合中，存到一个新集合
        Stream.concat(stream1, stream2).map((name)->new Person(name)).forEach((name)-> System.out.println(name));
        //6、根据姓名创建对象，存到一个新的集合中
        /*Stream<Person> stream6 = concat.map((name) -> new Person(name));*/
        //7、打印
       /*stream6.forEach(name-> System.out.println(name));*/
    }
}
