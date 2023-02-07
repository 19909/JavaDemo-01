package com.wei.pojo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 16:42
 * @PackageName:com.wei.pojo
 * @ClassName: Demo03
 * @Description: TODO
 * @Version 1.0
 * 强制类型装换
 */
public class Demo03 {
    public static void main(String[] args) {

        int a = 10;
        double b = 20.0;

        //小范围向大范围转换 （自动转换）
        double s = a;

        //大范围向小范围转换 （手动转换）
        int t = (int) b;
//        System.out.println(s);
        System.out.println(t);
    }
}
