package com.wei.javaSE.test;

import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/14 10:59
 * @PackageName:com.wei.javaSE.test
 * @ClassName: CirculationFor
 * @Description: TODO
 * @Version 1.0
 *
 *      循环for
 */
public class CirculationFor {
    public static void main(String[] args) {

        one:
        for (int i = 0; true; i++) {

            System.out.print(i);
            while (true){
                Random random = new Random();
                int nextInt = random.nextInt(12);
                System.out.print(nextInt);
                System.out.print("*");
                if (nextInt>10){
                    break one;
                }
            }

        }
    }
}
