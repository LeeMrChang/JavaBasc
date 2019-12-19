package com.lee.annotation.anli2;

/**
 * @ClassName:Calculator
 * @Author：Mr.lee
 * @DATE：2019/12/19
 * @TIME： 17:27
 * @Description: TODO
 */
public class Calculator {

    @check
    public void add(){
        String e = null;
        e.toString();
        System.out.println("1 + 0 = "+(1+0));
    }
    @check
    public void sub(){
        System.out.println("1 - 0 = "+(1-0));
    }
    @check
    public void mul(){
        System.out.println("1 * 0 = "+(1*0));
    }
    @check
    public void div(){
        System.out.println("1 / 0 = "+(1/0));
    }

    public void show(){
        System.out.println("show.....");
    }
}
