package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName:StreamCount
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 17:08
 * @Description: TODO
 */
public class StreamCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream = list.stream();
        //.count();统计Stream流中元素的个数
        long count = stream.count();
        System.out.println(count);
    }
}
