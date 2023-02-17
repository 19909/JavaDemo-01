package com.cn.chw.demo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 10:52
 * @PackageName:com.cn.chw.demo
 * @ClassName: AbstractDemo
 * @Description: TODO
 * @Version 1.0
 */
public abstract class AbstractDemo {

    //抽象方法
    public abstract String save();

    //引入接口
    public InterfaceDemo interfaceDemo;

    //普通方法（不需要子类必须实现）
    public String vivoCount(){
        return "";
    }



}
