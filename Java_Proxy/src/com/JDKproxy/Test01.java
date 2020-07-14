package com.JDKproxy;

public class Test01 {

    public static void main(String[] args) {
        // 真实角色，委托人
        User user = new UserImpl();    // 可执行真正的登录退出功能

        // 代理类
        UserDynamicProxy proxy = new UserDynamicProxy();

        // 获取委托对象user的代理对象
        User userProxy = proxy.getProxyInstance(user);


        // 系统运行，用户开始登录退出
        userProxy.login("小明", "111");
        userProxy.login("小红", "111");
        userProxy.login("小刚", "111");
        userProxy.logout("小明");
        userProxy.logout("小刚");
        userProxy.login("小黄", "111");
        userProxy.login("小黑", "111");
        userProxy.logout("小黄");
        userProxy.login("小李", "111");
        userProxy.logout("小李");
        userProxy.logout("小黄");
        userProxy.logout("小红");
    }
}
