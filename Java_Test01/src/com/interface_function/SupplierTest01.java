package com.interface_function;

import java.util.function.Supplier;

/**
 * @ClassName:SupplierTest01
 * @Author：Mr.lee
 * @DATE：2019/12/16
 * @TIME： 19:20
 * @Description: TODO
 */
public class SupplierTest01 {

    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
      //求数组中的最大值
        int[] arr = {100,-19,88,99,-20,709};
        int maxValue = getMax(()->{
            int max = 0;
            for (int i : arr) {
                if(i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组的最大值："+maxValue);
    }
}
