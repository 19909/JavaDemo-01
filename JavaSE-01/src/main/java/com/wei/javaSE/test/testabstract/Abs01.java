package com.wei.javaSE.test.testabstract;

import lombok.Data;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 9:11
 * @PackageName:com.wei.javaSE.test
 * @ClassName: Abs01
 * @Description: TODO
 * @Version 1.0
 */
@Data
public abstract class Abs01 {

    //抽象方法获取页码
    public abstract int getPage(int a);
    //抽象方法获取名称
    public abstract String getName();

    //普通方法
    public int getSum(int a,int b){
        System.out.println("使用了getSum方法");
        return a + b;
    }

    public String getId(){
        System.out.println("使用了getId普通方法");
        return "你好";
    }

}
