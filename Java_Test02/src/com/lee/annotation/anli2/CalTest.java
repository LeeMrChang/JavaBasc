package com.lee.annotation.anli2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName:CalTest
 * @Author：Mr.lee
 * @DATE：2019/12/19
 * @TIME： 17:31
 * @Description: TODO
 */
public class CalTest {

    public static void main(String[] args)throws IOException {
        //1、创建计算器对象
        Calculator calculator = new Calculator();
        //2、获取计算器对象的Class对象
        Class<? extends Calculator> calculatorClass = calculator.getClass();
        //3、根据Class对象获取所有成员方法
        Method[] methods = calculatorClass.getMethods();
        //4、创建写出流，写出错误原因
        //定义一个统计错误信息数量的变量
        int count = 0;
        BufferedWriter writer = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //5、判断成员方法是否被注解修饰
            if (method.isAnnotationPresent(check.class)) {
                //执行方法内容
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //捕获异常
                    count++;
                    writer.write(method.getName()+"方法异常");
                    writer.newLine();
                    writer.write(e.getCause().getClass().getSimpleName()+"异常的名称");
                    writer.newLine();
                    writer.write(e.getCause().getMessage()+"方法异常");
                    writer.write("-----------------------");
                    writer.newLine();
                }
            }
        }
        writer.write("本次测试一共出现"+count+"次异常");
        writer.flush();
        writer.close();
    }
}
