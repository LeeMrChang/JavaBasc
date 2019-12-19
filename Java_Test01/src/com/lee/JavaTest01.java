package com.lee;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @ClassName:JavaTest01
 * @Author：Mr.lee
 * @DATE：2019/12/01
 * @TIME： 9:26
 * @Description: TODO
 */
public class JavaTest01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i1 = scanner.nextInt();
        System.out.println(i1);

        List<Object> arr = new ArrayList<>();
        Integer abc = 1;
        test01();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("++++++++++++");
        int i = 1;
        while (i<100){
            System.out.println(i);
            i++;
        }
        int r =1;
        do {
            System.out.println(r);
            r++;
        }while (r<10);

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //三元
        int c = 1==1?100:200;
        System.out.println(c);
        JavaTest01 test01 = new JavaTest01();

        int v = 1;
        switch (v){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
        }
        System.out.println(7%4);
    }

    public static void test01(){

        System.out.println("你好");

        return;
    }

    public String test02(){

        return "";
    }


}
