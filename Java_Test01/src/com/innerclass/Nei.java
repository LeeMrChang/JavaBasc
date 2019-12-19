package com.innerclass;

import java.sql.SQLOutput;

/**
 * @ClassName:Nei
 * @Author：Mr.lee
 * @DATE：2019/12/03
 * @TIME： 19:52
 * @Description: TODO
 */
public class Nei {

    private int num;
    private String name;

    public void test01(){
        System.out.println("外部类");
    }

  public class Wai{
        public void test01(){
            System.out.println("内部类");
        }

        private int num;
        private String name;
    }
}
