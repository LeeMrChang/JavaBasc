package com.lee.domain;

import java.util.Date;

/**
 * @ClassName:User
 * @Author：Mr.lee
 * @DATE：2020/01/09
 * @TIME： 17:09
 * @Description: TODO
 */
public class User {

    private String username;
    private int age;
    private Date birthday;

    public User() {
    }

    public User(String username, int age, Date birthday) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
