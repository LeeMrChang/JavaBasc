package com.interface_function;

import java.util.function.Consumer;

/**
 * @ClassName:ConsumerTest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 19:27
 * @Description: TODO
 */
public class ConsumerTest01 {

    public static void method(String name, Consumer<String> consumer){
        //消费数据的方法
        consumer.accept(name);
    }
    public static void main(String[] args) {
        method("刘德华",(name)->{
            //字符串翻转
            String names = new StringBuffer(name).reverse().toString();
            System.out.println(names);
        });
    }
}
