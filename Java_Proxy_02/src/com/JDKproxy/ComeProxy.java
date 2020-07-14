package com.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class ComeProxy implements InvocationHandler {

    /**
     * 统计来宾访问人数
     */
    private static int count = 0;

    /**
     * 创建委托对象
     */
    public Object target;

    /**
     * 获取委托对象的方法
     */
    public <T> T getProxyObject(Object target){
        //赋值操作
        this.target = target;
        Class<?> clazz = target.getClass();
        ClassLoader loader = clazz.getClassLoader();
        Class<?>[] interfaces = clazz.getInterfaces();
        //返回委托对象
        return (T) Proxy.newProxyInstance(loader,interfaces,this);
    }


    /**
     * JDK 的代理逻辑操作实现
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object r = null;
        //获取要代理的对象
        r = method.invoke(target,args);

        //统计来访人数
        if("comeIn".equals(method.getName())){
            if((boolean) r == true){
                count += 1;
            }
        }

        else if("comeOut".equals(method.getName())){
            count -= 1;
        }

        //代理操作。统计来访人数；
        getCount();
        return r;
    }

    public void getCount(){
        System.out.println("当前来宾访问成功人数为："+count);
    }
}
