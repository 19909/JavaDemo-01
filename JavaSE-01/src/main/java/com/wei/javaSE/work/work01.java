package com.wei.javaSE.work;

import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 10:36
 * @PackageName:com.wei.javaSE
 * @ClassName: work01
 * @Description: TODO
 * @Version 1.0
 */
public class work01 {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int nextInt = random.nextInt(10);
            System.out.println(nextInt);
        }
    }
}
