package com.JDKproxy;

public class ComeTest {

    public static void main(String[] args) {

        Come come = new ComeImpl();

        //获取代理对象
        ComeProxy proxy = new ComeProxy();
        Come comeProxy = proxy.getProxyObject(come);

        comeProxy.comeIn("小东","12");
        comeProxy.comeIn("小东","12");
        comeProxy.comeIn("小东","12");
        comeProxy.comeOut("啊林");
        comeProxy.comeOut("啊林");
        comeProxy.comeOut("啊林");

    }
}
