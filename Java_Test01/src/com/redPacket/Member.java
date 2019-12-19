package com.redPacket;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName:Member
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 11:18
 * @Description: TODO
 */
public class Member extends User {

    public Member() {
    }

    public Member(String username, Double leftMoney) {
        super(username, leftMoney);
    }

    /**
     * 打开红包的操作
     * @param list
     */
    public void openRedPacket(ArrayList<Double> list){

        /**
         * 创建一个随机打开的方式
         */
        Random random = new Random();

        int anInt = random.nextInt(list.size());

        /**
         * 删除拿到金额
         */
        Double number = list.remove(anInt);

        /**
         * 设置随机打开一个拿到的金额
         */
        super.setLeftMoney(number);
    }
}
