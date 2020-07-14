package com.lee.test;

import com.lee.junit.Calculator;

import com.mysql.jdbc.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName:CalculatorTest
 * @Author：Mr.lee
 * @DATE：2019/12/18
 * @TIME： 19:14
 * @Description: TODO
 */
public class CalculatorTest {

    @Before
    public void before(){
        //@Before 用于资源初始加载
        System.out.println("init.....");
    }

    @After
    public void after(){
        //@After  用于资源关闭   无论代码是否出现异常，这个两个方法都会执行
        System.out.println("close...");
    }

    @Test
    public void add(){
        //1、创建计算器对象
        Calculator c = new Calculator();
        //2、调用对象的加法方法
        int add = c.add(32, 34);
        System.out.println("test....");
        //3、使用测试的断言方法，对要测试的方法进行测试
        //不要输出结果，expected代表预判结果为66，而add是实际结果，比对是否正确1
        Assert.assertEquals(66,add);
    }

    @Test
    public void sub(){
        //1、创建计算器对象
        Calculator c = new Calculator();
        //2、调用对象的减法方法
        int sub = c.sub(32, 34);
        Assert.assertEquals(66,sub);
    }

    @Test
    public void sbus(){
        String str = "abc,12,3yy98,0";
        String[]  strs=str.split(",");
        for(int i=0,len=strs.length;i<len;i++){
            System.out.println(strs[i].toString());
        }
    }

    @Test
    public void sbus1(){
        String str = "yyyy-MM-dd";
        String replace = str.replace("-", "");
        System.out.println(replace);
    }

}
