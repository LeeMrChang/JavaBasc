package com.interface_function;

/**
 * @ClassName:TestLogger01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 11:23
 * @Description: TODO
 */
public class TestLogger01 {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        show(1,msg1+msg2+msg3);
    }

    private static void show(int grade, String msg) {
        //对日志等级进行判断
        if(grade == 1){
            System.out.println(msg);
        }
    }
}
