package com.wei.pojo;

import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 20:00
 * @PackageName:com.wei.pojo
 * @ClassName: Demo10
 * @Description: TODO
 * @Version 1.0
 */
public class Demo10 {

    public static void main(String[] args) {
        Random rand = new Random();
//        double money = rand.nextDouble(10.000,99.999);
        int money = rand.nextInt(80)+(10);
        System.out.printf("%.2f元%n",money);
        System.out.printf("%.3f元%n",money);
        System.out.printf("%.0f元%n",money);
        System.out.printf("%10.4f%n",money);
        System.out.printf("%10.4f%n",1f);

    }
}
