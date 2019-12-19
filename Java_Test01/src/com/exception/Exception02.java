package com.exception;

import java.util.Scanner;

/**
 * @ClassName:Exception02
 * @Author：Mr.lee
 * @DATE：2019/12/10
 * @TIME： 20:38
 * @Description: TODO
 */
public class Exception02 {

    static String[] arr = {"李三","刘东","林旭","苏伦"};

    public static void main(String[] args) throws RegisterException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = sc.next();
        checkName(name,arr);
    }

    private static void checkName(String name, String[] arr) throws RegisterException {

        for (String username : arr) {
            if(username.equals(name)){
                throw new RegisterException("此名字已经注册过");
            }
        }

        System.out.println("注册成功！");
    }
}

