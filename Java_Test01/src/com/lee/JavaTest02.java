package com.lee;


import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName:JavaTest02
 * @Author：Mr.lee
 * @DATE：2019/12/01
 * @TIME： 12:57
 * @Description: TODO
 */
public class JavaTest02 {
    public static void main(String[] args) {

        Random random = new Random(10);
        int i = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

       String num = "abisd";

        System.out.println();

       String s = new String("abhjnd");


        int a = 1;
        while (a<11){
            System.out.println("请输入一个要猜的数");
            int v = scanner.nextInt();

            if(v>i){
                System.out.println("你输入的数字大了");

            }else if(v<i){
                System.out.println("你输入的数字小了");

            }else {
                System.out.println("你猜中了");
                break;
            }

            a++;

        }





    }
}
