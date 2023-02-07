package com.wei.pojo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 16:15
 * @PackageName:com.wei.pojo
 * @ClassName: Demo01
 * @Description: TODO
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {

        System.out.println("你好,Java");
        System.out.println(System.getProperty("java.version"));//1.8.0_121      --Java版本
        System.out.println(System.getProperty("java.home"));//D:\JavaEE\JDK\jre --java的运行环境路径
        System.out.println(System.getProperty("os.name"));//Windows 10          --操作系统的名字
        System.out.println(System.getProperty("user.home"));//C:\Users\19909    --用户的家目录

    }
}
