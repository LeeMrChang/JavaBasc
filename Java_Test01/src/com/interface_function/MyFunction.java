package com.interface_function;

/**
 * @ClassName:MyFunction
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 11:04
 * @Description: TODO
 */
@FunctionalInterface   //检测是否为一个函数式接口（有且仅有一个抽象方法的接口）
public interface MyFunction {
    public abstract void method();
}
