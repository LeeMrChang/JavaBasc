package com.interface_function;

/**
 * @ClassName:ShowTest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 11:06
 * @Description: TODO
 */
public class ShowTest01 {
    public static void main(String[] args) {

        show(new MyFunctionImpl());

        show(()-> {
                System.out.println("使用Lambda表达式");
        });

        show(()-> System.out.println("使用Lambda表达式简化版..."));
    }

    public static void show(MyFunction myFunction){
        myFunction.method();
    }
}
