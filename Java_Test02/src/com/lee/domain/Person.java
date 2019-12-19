package com.lee.domain;

/**
 * @ClassName:Person
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 19:46
 * @Description: TODO
 */
public class Person {
    private String name;
    private int age;

    public String username;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println("吃饭了...");
    }
    public void eat(String food){
        System.out.println("吃饭了..."+food);
    }
}
