package com.cn.chw.bean;

import java.util.Arrays;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 14:42
 * @PackageName:com.cn.chw.bean
 * @ClassName: Demo
 * @Description: TODO
 * @Version 1.0
 *
 *      static关键字在类中的作用
 */
public class Demo {

    private static int i = 18;
    private String name = "Tom";

    private static int save(int a,int b){
        return a+b;
    }
    private int remove(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        //静态访问
        System.out.println(Demo.i);
        System.out.println(Demo.save(1, 3));
        //对象访问
        Demo demo = new Demo();
        System.out.println(demo.remove(1, 8));
        System.out.println(demo.name);


    }


}
