package com.redPacket;

/**
 * @ClassName:User
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 11:02
 * @Description: TODO
 */
public class User {

    private String username;

    private Double leftMoney;

    public User() {
    }

    public User(String username, Double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(Double leftMoney) {
        this.leftMoney = leftMoney;
    }

    //展示信息
    public void show(){
        System.out.println("用户："+username+"余额："+leftMoney+"元");
    }
}
