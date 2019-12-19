package com.BufferedIO;

import java.io.Serializable;

/**
 * @ClassName:Person
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 14:48
 * @Description: TODO
 */
public class Person implements Serializable{
    /**
     * 如果没有实现序列化就会报
     * NotSerializableException
     */
    private String name;
    public Integer age;


    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
