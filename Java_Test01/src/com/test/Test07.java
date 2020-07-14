package com.test;

public class Test07 {

    public static void main(String[] args) {
        Long[] longs = pushIds(10, 4L);
        for (int i = 0; i < longs.length; i++) {
            System.out.println("I:"+i);
        }
    }

    public static Long[] pushIds(int len,Long id){
        Long[] ids = new Long[len];
        for (int i = 0; i <ids.length ; i++) {
            ids[i]=id;
        }
        System.out.println("id:"+id);
        return ids;
    }
}
