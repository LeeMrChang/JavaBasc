package com.lee;

import java.util.*;

/**
 * @ClassName:JavaTest08
 * @Author：Mr.lee
 * @DATE：2019/12/09
 * @TIME： 19:28
 * @Description: TODO
 */
public class JavaTest08 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        //添加
        map.put("李小龙",18);
        map.put("丁大恺",19);
        map.put("吴中智",18);
        System.out.println(map);
        //获取
        Integer integer = map.get("李小龙");
        System.out.println(integer);
        //删除
        map.remove("吴中智");
        System.out.println(map);
        //判断是否存在key
        boolean b = map.containsKey("李小龙");
        System.out.println(b);
        boolean b1 = map.containsKey("吴中智");
        System.out.println(b1);
        //判断是否存在value
        boolean b2 = map.containsValue(18);
        System.out.println(b2);
        boolean b3 = map.containsValue(20);
        System.out.println(b3);
        //键找值
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Integer integer1 = map.get(s);
            System.out.println(s+":"+integer1);
        }
        //通过迭代器遍历
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        //增强for遍历
        for (String s : keySet) {
            Integer value = map.get(s);
            System.out.println(s+":"+value);
        }
        //第二种增强for
        for (String s : map.keySet()) {
            Integer value = map.get(s);
            System.out.println(s+":"+value);
        }

        //Entry  键值对对象，获取键与值
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        Hashtable<String,String> maps = new Hashtable<>();
        maps.put("1",null);
    }
}
