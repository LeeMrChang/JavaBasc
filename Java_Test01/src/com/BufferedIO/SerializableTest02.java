package com.BufferedIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Properties;

/**
 * @ClassName:SerializableTest02
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 14:59
 * @Description: TODO
 */
public class SerializableTest02 {
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        //InvalidClassException 两个序列化号不一致错误，反序列化常见异常
        //1、创建反序列化对象，就是读取内存中保存的对象
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream(
                        "Java_Test01/src/com/BufferedIO/K.txt"));
        //读取 ClassNotFoundException  文件class不存在异常，读取的时候文件可能会不存在
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
        //类型强转
        Person person = (Person) obj;
        System.out.println(person.getName()+"="+person.getAge());
    }
}
