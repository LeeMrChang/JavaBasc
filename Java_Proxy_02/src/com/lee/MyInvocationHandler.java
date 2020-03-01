package com.lee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 包名:com.itheima.proxy
 * 作者:Leevi
 * 日期2019-04-19  18:19
 */
public class MyInvocationHandler implements InvocationHandler{
    private IKindWomen women;

    public MyInvocationHandler(IKindWomen women) {
        this.women = women;
    }

    private void openHouse(){
        System.out.println("战前准备");
    }
    private void clear(){
        System.out.println("打扫战场");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理对象调用任何方法都会执行到invoke来
        String methodName = method.getName();
        if (methodName.equals("happy")) {
            //代理happy()方法
            openHouse();
            //执行委托者的happy()方法
            women.happy();
            clear();
        }
        return null;
    }
}
