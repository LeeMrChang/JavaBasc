package com.redPacket;

import java.util.ArrayList;

/**
 * @ClassName:Admin
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 11:05
 * @Description: TODO
 */
public class Admin extends User {

    public Admin() {
    }

    public Admin(String username, Double leftMoney) {
        super(username, leftMoney);
    }

    /**
     * 设置分红包的方法
     * @param money  分的金额
     * @param count  分的份额
     * @return
     */
    public ArrayList<Double> sendList(int money,int count){

        Double leftMoney = super.getLeftMoney();

        /**
         * 判断分的金额不能大于余额
         */
        if(money>leftMoney){
            return null;
        }

        /**
         * 设置分出去之后的余额
         */
        super.setLeftMoney(leftMoney-money);


        money = money * 100;

        /**
         * 份额
         */
        int num = money / count;

        /**
         * 份额是否整除
         */
        int chu = money % count;

        ArrayList<Double> list = new ArrayList<>();

        /**
         * 遍历份额，计算添加每份金额
         */
        for (int i = 0; i < count-1; i++) {
            list.add(num/100.0);
        }

        if(chu==0){
            list.add(num/100.0);
        }else {
            list.add((num+1)/100.0);
        }

        return list;
    }
}
