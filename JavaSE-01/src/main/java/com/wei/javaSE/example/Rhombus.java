package com.wei.javaSE.example;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 15:32
 * @PackageName:com.wei.javaSE.example
 * @ClassName: Rhombus
 * @Description: TODO
 * @Version 1.0
 *
 *      菱形
 */
public class Rhombus {

    public static void main(String[] args) {

        int s = 10;
        for (int i = 1; i < 10; i+=2) {
            s--;
            for (int t = s; t>=1 ; t--){
                System.out.print(" ");
            }
            for (int n = 1; n<= i ; n++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 7; i >=1; i-=2) {
            s++;
            for (int t = s; t>=1 ; t--){
                System.out.print(" ");
            }
            for (int n = 1; n<= i ; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
