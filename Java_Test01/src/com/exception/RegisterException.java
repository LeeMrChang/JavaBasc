package com.exception;

/**
 * @ClassName:RegisterException
 * @Author：Mr.lee
 * @DATE：2019/12/10
 * @TIME： 20:33
 * @Description: TODO
 */
public class RegisterException extends Exception {

    /**
     * 添加一个空参的构造方法
     */
    public RegisterException(){
        super();
    }

    /**
     * 给一个带异常信息的构造方法
     * 查看源码发现，所有的异常类都会有一个带异常信息的构造方法，
     * 让父类来处理这个异常信息
     */
    public RegisterException(String message){
        super(message);
    }
}
