package com.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @ClassName:StreamTest02
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 21:16
 * @Description: TODO
 */
public class StreamTest02 {
    public static void main(String[] args) {
        //集合或者数组获取流的各种方式
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        //set
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        //map，获取键
        Map<String,String> map = new HashMap<>();
        Set<String> set1 = map.keySet();
        Stream<String> stream3 = set1.stream();
        //map，获取值
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //map,获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();
        //数组形式
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5);
        //数组字符串形式
        String[] str = {"a","bb","ccc"};
        Stream<String> stream7 = Stream.of(str);

    }
}
