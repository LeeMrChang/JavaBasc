package com.lee;

import java.lang.reflect.Proxy;

/**
 * 包名:com.itheima.proxy
 * 作者:Leevi
 * 日期2019-04-19  18:17
 */
public class Client {
    public static void main(String[] args) {
        Jinlian jinlian = new Jinlian();
        Class<? extends Jinlian> clazz = jinlian.getClass();

        //使用动态代理生成金莲的代理对象
        //参数一:类加载器对象
        //参数二:要代理的接口的字节码对象的数组
        //要代理的接口就是金莲实现的接口，所以我们就要获取金莲实现的所有接口
        Class<?>[] interfaces = clazz.getInterfaces();

        //参数三:InvocationHandler的实现类对象
        IKindWomen proxy = (IKindWomen) Proxy.newProxyInstance(clazz.getClassLoader(), interfaces, new MyInvocationHandler(jinlian));

        //调用代理对象的方法
        proxy.happy();
    }
}
