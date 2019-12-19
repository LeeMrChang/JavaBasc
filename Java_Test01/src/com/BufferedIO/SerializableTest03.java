package com.BufferedIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:SerializableTest03
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 15:19
 * @Description: TODO
 */
public class SerializableTest03 {
    /**
     * 使用集合存储多个对象，
     * 然后使用序列化与反序列化分别写入与读取这个集合
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        //创建一个序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(
                        "Java_Test01/src/com/BufferedIO/list.txt"));
        //创建一个反序列化对象
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(
                        "Java_Test01/src/com/BufferedIO/list.txt"));
        //写出一个序列化
        oos.writeObject(list);
        //读取一个序列化
        Object o = ois.readObject();
        //关闭流
        oos.close();
        ois.close();
        //打印内容
        List<Person> arr = (List<Person>) o;
        for (Person person : arr) {
            System.out.println(person.getName()+"="+person.getAge());
        }
    }
}
