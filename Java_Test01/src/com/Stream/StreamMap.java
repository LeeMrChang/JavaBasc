package com.Stream;

import java.util.stream.Stream;

/**
 * @ClassName:StreamMap
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 16:53
 * @Description: TODO
 */
public class StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        //使用map方法，映射，将字符串类型的数据转换（映射）为Integer类型
        Stream<Integer> stream1 = stream.map((str) -> Integer.parseInt(str));
        stream1.forEach((i)-> System.out.println(i));
    }
}
