package com.cn.chw.demo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 8:33
 * @PackageName:com.cn.chw.demo
 * @ClassName: SingleObjectDemo
 * @Description: TODO
 * @Version 1.0
 *
 *      单例模式的实现
 */
public class SingleObjectDemo {
    //属性
    private String name;

    //设置一个SingleObjectDemo类的属性；
    public static SingleObjectDemo single;

    //私有化无参构造器
    private SingleObjectDemo(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //为外界提供访问改类的入口
    public static SingleObjectDemo getInstance(){
        if (single == null){
            single = new SingleObjectDemo();
        }
        return single;
    }
}
