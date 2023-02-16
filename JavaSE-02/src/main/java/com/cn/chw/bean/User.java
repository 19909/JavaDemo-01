package com.cn.chw.bean;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 14:11
 * @PackageName:com.cn.chw.bean
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 *
 *      类中的属性、方法、代码块执行时刻、静态代码块执行时刻
 */
public class User {
    //属性
    private Integer age;
    private String userName;

    //方法
    public void save(){

    }

    //代码块
    {
        System.out.println("代码块1");
    }
    {
        System.out.println("代码块2");
    }

    //静态代码块
    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", userName='" + userName + '\'' +
                '}';
    }
}
