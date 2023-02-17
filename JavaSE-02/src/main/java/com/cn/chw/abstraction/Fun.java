package com.cn.chw.abstraction;

/**
 * @Author ChenHeWei
 * @Date 2023/2/17 10:37
 * @PackageName:com.cn.chw.abstraction
 * @ClassName: Fun
 * @Description: TODO
 * @Version 1.0
 */
public interface Fun {
    public static final Integer I = 12;

    void get();

    static int ft(int a){
        return  a*a;
    };

    //
    public static void main(String[] args) {
        System.out.println("----");
    }
}
