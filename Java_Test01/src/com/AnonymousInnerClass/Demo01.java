package com.AnonymousInnerClass;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

import static com.lee.JavaTest01.test01;

/**
 * @ClassName:Demo01
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 20:03
 * @Description: TODO
 */
public class Demo01{

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

       printArray(strings);
       printArray(list);
    }

    private static void printArray(List<?> list) {

        Iterator<?> iterator = list.iterator();

        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }

    }


    public void deom01(){
        //获取
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        //设置
        calendar.set(Calendar.YEAR,99);
        calendar.set(Calendar.MONTH,12);

        //字符串缓冲区
        StringBuilder builder = new StringBuilder();
        builder.append("");
        builder.toString();

        Collection<String> collection = new ArrayList<>();
        List<Object> list = new ArrayList<>();

        Iterator<String> iterator = collection.iterator();

    }

}
