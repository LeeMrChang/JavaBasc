package com.lee.domain;

import java.io.Serializable;

/**
 * @ClassName:Account
 * @Author：Mr.lee
 * @DATE：2019/12/22
 * @TIME： 13:45
 * @Description: TODO
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private String balance;

    public Account() {
    }

    public Account(Integer id, String name, String balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
