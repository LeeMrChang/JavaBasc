package com.Stream;

import java.util.stream.Stream;

/**
 * @ClassName:StreamLimit
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 17:11
 * @Description: TODO
 */
public class StreamLimit {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        //Stream流添加对个元素的方法of();
        Stream<String> stream = Stream.of(arr);
        //使用limit();截取流中的前3个元素
        Stream<String> stream1 = stream.limit(3);
        stream1.forEach((name)-> System.out.print(name+" "));
    }
}
