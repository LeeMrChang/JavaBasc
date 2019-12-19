package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName:PropertiesTest02
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:46
 * @Description: TODO
 */
public class PropertiesTest02 {
    public static void main(String[] args)throws IOException {

        Properties properties = new Properties();
        //setProperty  设置key与value的方法
        properties.setProperty("姚明","226");
        properties.setProperty("奥尼尔","218");
        properties.setProperty("詹姆斯","203");
        properties.setProperty("科比","197");

        //写出流
        FileWriter fw = new FileWriter(
                "D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\f.txt",true);

        //properties.store(fw,"save date");将集合中的临时数据写入硬盘中做持久储存
        properties.store(fw,"save date");

        fw.close();
    }
}
