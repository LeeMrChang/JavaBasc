package com.interface_function;

import sun.plugin2.message.Message;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @ClassName:ConsumerTest03
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 19:49
 * @Description: TODO
 */
public class ConsumerTest03 {
    public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        //andThen();将两个接口的数据连接在一起消费
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"杨丽,18", "小炮,20", "区区,19"};
        method(arr, (message) -> {
                    String s = message.split(",")[0];
                    System.out.println("姓名：" + s);
                },
                (message) -> {
                    String s = message.split(",")[1];
                    System.out.println("年龄："+s);
                }
        );
    }
}
