package com.Stream;

import java.util.stream.Stream;

/**
 * @ClassName:StreamSkip
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 17:16
 * @Description: TODO
 */
public class StreamSkip {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        //Stream流添加对个元素的方法of();
        Stream<String> stream = Stream.of(arr);
        //使用.skip(3);跳过前几个元素
        Stream<String> stream1 = stream.skip(3);
        stream1.forEach((name)-> System.out.print(name+" "));
    }
}
