package com.cn.chw.bean;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 15:23
 * @PackageName:com.cn.chw.bean
 * @ClassName: Demo02
 * @Description: TODO
 * @Version 1.0
 *
 *      Integer自动装箱，自动拆箱
 */
public class Demo02 {

    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = 10;
        Integer c = 10;
        Integer d = 128;
        Integer e = 128;

        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(d==e);
    }
}
