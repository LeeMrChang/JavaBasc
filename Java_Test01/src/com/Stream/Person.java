package com.Stream;

/**
 * @ClassName:Person
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 17:38
 * @Description: TODO
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
