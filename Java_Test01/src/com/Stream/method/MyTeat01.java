package com.Stream.method;

/**
 * @ClassName:MyTeat01
 * @Author：Mr.lee
 * @DATE：2019/12/17
 * @TIME： 19:34
 * @Description: TODO
 */
public class MyTeat01 {

    public static void printTo(Printable printable){
        printable.MyMethod("helloWord!");
    }

    public static void main(String[] args) {
        printTo((str)->
            new MyObject().toCase(str)
        );
        //方法引用
        printTo(new MyObject()::toCase);
    }
}
