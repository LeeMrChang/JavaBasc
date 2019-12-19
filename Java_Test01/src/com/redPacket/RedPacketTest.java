package com.redPacket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName:RedPacketTest
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 11:23
 * @Description: TODO
 */
public class RedPacketTest {

    public static void main(String[] args) {

        /**
         * 创建群主对象，并设置好群主金额
         */
        Admin admin = new Admin("哈比鸟", 200.0);

        /**
         * 创一个发红包的方式
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要发出红包的金额：");
        int money = sc.nextInt();
        System.out.println("您要将红包分成几份：");
        int count = sc.nextInt();

        /**
         * 发送红包
         */
        ArrayList<Double> list = admin.sendList(money, count);

        /**
         * 判断发送的余额不能为空
         */
        if(list==null){
            System.out.println("余额不足。。。。。");
            return;
        }

        /**
         * 创建成员对象
         */
        Member member1 = new Member("a",20.0);
        Member member2 = new Member("b",30.0);
        Member member3 = new Member("c",40.0);

        /**
         * 打开红包
         */
        member1.openRedPacket(list);
        member2.openRedPacket(list);
        member3.openRedPacket(list);

        admin.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
