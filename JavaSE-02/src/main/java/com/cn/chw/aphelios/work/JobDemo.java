package com.cn.chw.aphelios.work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/23  14:30
 * @PackageName: com.cn.chw.aphelios.work
 * @ClassName: JobDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class JobDemo {


    //猜数字游戏
    public static void number(){
        Random random = new Random();
        int nextInt = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个0-10的整数");
        int num = 0;
        while (true){
            try {
                num = scanner.nextInt();
                if (nextInt == num){
                    System.out.println("恭喜你猜对了");
                    break;
                } else {
                    System.out.println("猜错了,请重新输入");
                    continue;
                }
            } catch (Exception e){
                e.printStackTrace();
                break;
            }
        }
    }
    //遍历一个数组
    public static void sort(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(50);
            a[i] = num;
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
//        number();
        sort();
    }



}
