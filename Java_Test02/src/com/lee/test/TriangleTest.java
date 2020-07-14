package com.lee.test;

import java.util.Scanner;

public class TriangleTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();
        for (int i = 1; i <= anInt; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
