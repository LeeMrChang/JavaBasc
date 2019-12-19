package com.BufferedIO;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName:Test02
 * @Author：Mr.lee
 * @DATE：2019/12/15
 * @TIME： 13:41
 * @Description: TODO
 */
public class LiBaiTest02 {

    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<>();
        //创建字符读取流
        BufferedReader br = new BufferedReader(new FileReader("Java_Test01/src/com/BufferedIO/in.txt"));
        //创建字符写出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_Test01/src/com/BufferedIO/out.txt"));
        //读取
        String line;
        while ((line = br.readLine())!=null){
            //截取内容并将内容封装到map中
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        //遍历map并将数据写出
        Set<String> strings = map.keySet();
        for (String key : strings) {
            String value = map.get(key);
            line = key+value;
            bw.write(line);
            bw.newLine();
        }
        //关闭流
        bw.close();
        br.close();
    }
}
