package com.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName:PropertiesTest03
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 15:54
 * @Description: TODO
 */
public class PropertiesTest03 {
    public static void main(String[] args)throws IOException {

        Properties prop = new Properties();
        //读取配置文件中的数据值   key对应value
        prop.load(new FileReader("D:\\IdeaProjects\\JavaBasic\\Java_Test01\\src\\com\\io\\f.txt"));
        Set<String> strings = prop.stringPropertyNames();
        for (String key : strings) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
