package com.Stream;

import java.util.stream.Stream;

/**
 * @ClassName:StreamConcat
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 17:22
 * @Description: TODO
 */
public class StreamConcat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张无忌", "周芷若", "赵敏", "张强", "张三丰");
        String[] arr = {"a","b","c","d","e"};
        Stream<String> stream2 = Stream.of(arr);
        //.concat(stream1, stream2);将两个流组合成为一个流，是一个静态方法
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach((name)-> System.out.println(name));
    }
}
