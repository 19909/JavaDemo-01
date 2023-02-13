package com.wei.javaSE.example;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 15:59
 * @PackageName:com.wei.javaSE.example
 * @ClassName: Multiplication
 * @Description: TODO
 * @Version 1.0
 *
 *      九九乘法表
 */
public class Multiplication {


    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %2d\t\t",i,j,i*j);
            }
            System.out.println();
        }
    }
}
