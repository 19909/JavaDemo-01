package com.wei.pojo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 16:27
 * @PackageName:com.wei.pojo
 * @ClassName: Demo02
 * @Description: TODO
 * @Version 1.0
 */
public class Demo02 {
    /*
     *  成员变量
     *       作用域：和this的作用域一样
     * */
    final static int A = 2;

    public static void main(String[] args) {
        //局部变量
        //作用域 ： 当前方法有效
        double s = 12.0;
        //代码块
        {
            //代码块变量
            //作用域： 当前代码块
            int Y = 12;
            //代码块变量
            System.out.println(Y);
        }

        //局部变量
        System.out.println(s);

        //成员变量
        System.out.println(A);

    }
}
