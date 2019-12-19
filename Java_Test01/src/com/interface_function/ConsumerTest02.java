package com.interface_function;

import java.util.function.Consumer;

/**
 * @ClassName:ConsumerTest02
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 19:36
 * @Description: TODO
 */
public class ConsumerTest02 {

    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        con1.accept(s);
        con2.accept(s);
        //andThen();将两个接口的数据连接在一起消费
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("hello",
                (s)-> System.out.println(s.toUpperCase()),
                (t)-> System.out.println(t.toLowerCase())
        );
    }
}
