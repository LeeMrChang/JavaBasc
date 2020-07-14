package com.lee.single.hungerMan;

import java.io.IOException;
import java.util.Properties;

/**饿汉式：
 * 静态代码块类型的单例
 * 常用于需要加载有配置文件的场景下
 */
public class Singleton3 {

    public static final Singleton3 INSTANCE ;

    /**
     *  定义要加载的配置文件的变量
     */
    private String info;

    static {
        try {
            //创建 Properties 配置文件对象
            Properties pro = new Properties();

            //对象调用 getClassLoader()方法加载   getResourceAsStream获取此配置文件
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));

            //将此配置文件复制给此实例
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 创建有参构造进行赋值
     * @param info
     */
    Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}
