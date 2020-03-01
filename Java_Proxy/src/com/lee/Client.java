package com.lee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName:Client
 * @Author：Mr.lee
 * @DATE：2020/03/01
 * @TIME： 16:19
 * @Description: TODO
 */
public class Client {


    public static void main(String[] args) {
        //调用IKindWomen接口的对象的happy()方法
        //1.接口的实现类的对象   2.接口的代理对象
        //使用动态代理创建IKindWomen接口的动态代理对象
        //参数一:类加载器对象
        ClassLoader classLoader = IKinWomen.class.getClassLoader();

        //参数二:要代理的接口的字节码对象的数组
        Class<?>[] clazzs = {IKinWomen.class};

        //参数三:InvocationHandler的实现类对象,我们可以使用匿名内部类

        IKinWomen proxy = (IKinWomen) Proxy.newProxyInstance(classLoader, clazzs, new InvocationHandler() {
            //调用代理者的任意方法，都会执行invoke()方法
            private void openHouse(){
                System.out.println("战前准备");
            }
            private void clear(){
                System.out.println("打扫战场");
            }
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //参数一:proxy就表示代理对象，千万不要去使用它
                //参数二:method表示代理对象当前调用的方法
                //参数三:代理者调用方法时候传入的参数
                //判断，当前调用的方法是什么方法
                String methodName = method.getName();
                if (methodName.equals("happy")) {
                    openHouse();
                    //正则执行happy()方法
                    System.out.println("好嗨哟...");
                    clear();
                    return null;
                }else if(methodName.equals("collect")){
                    System.out.println("收取手续费" + (double)args[0] * 0.4);

                    System.out.println("给委托者:" + (double) args[0] * 0.6);
                    return (double) args[0] * 0.6;
                }else {
                    //其它情况先不做处理
                    return null;
                }
            }
        });

        //调用代理对象的方法
        proxy.happy();
        //invoke()方法的返回值，就是代理对象调用的方法的返回值
        double collect = proxy.collect(1000.00);
        System.out.println("返回值是:" + collect);
    }
}
