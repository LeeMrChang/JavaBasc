package com.Stream.method3;

/**
 * @ClassName:Zi
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 20:05
 * @Description: TODO
 */
public class Zi extends Fu {
    @Override
    public void sayHello() {
        System.out.println("你好！我是子子子！");
    }
    public void method(Greetbale g){
        g.greet();
    }

    public void show(){
        method(()->{
            Fu fu = new Fu();
            fu.sayHello();
        });
        //父级别的引用
        method(()->{
           super.sayHello();
        });
        //方法引用
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Zi().show();
    }
}
