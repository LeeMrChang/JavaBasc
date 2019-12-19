package com.Stream;

import java.util.ArrayList;

/**
 * @ClassName:StreamTest03
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 17:28
 * @Description: TODO
 */
public class StreamTest03 {
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
        ArrayList<String> one1 = new ArrayList<>();
        for (String s : one) {
            if(s.length()==3){
                one1.add(s);
            }
        }
        ArrayList<String> one2 = new ArrayList<>();
        //2、取筛选后集合的前3个元素
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));
        }
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        //3、只要姓“张” 的成员，存到一个新集合
        ArrayList<String> two1 = new ArrayList<>();
        for (String s : two) {
            if(s.startsWith("张")){
                two1.add(s);
            }
        }
        ArrayList<String> two2 = new ArrayList<>();
        //4、筛选替我two1集合中的不要前2个元素，存到一个集合
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }
        //5、将两个集合整合为一个集合中，存到一个新集合
        ArrayList<String> all = new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);
        //6、根据姓名创建对象，存到一个新的集合中
        ArrayList<Person> person = new ArrayList<>();
        for (String name : all) {
            person.add(new Person(name));
        }
        //7、打印
        System.out.println(person);
    }
}
