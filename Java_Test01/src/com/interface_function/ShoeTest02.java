package com.interface_function;

/**
 * @ClassName:ShoeTest02
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 11:35
 * @Description: TODO
 */
public class ShoeTest02 {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        show(2,()->{
            return msg1+msg2+msg3;
        });
    }

    private static void show(int grade, MessageBuild msg) {
        //对日志等级进行判断
        if(grade == 1){
            System.out.println("测试：Lambda表达式延迟加载的性能");
            System.out.println(msg.messageBuilds());
        }
    }
}
