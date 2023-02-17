package com.cn.chw.abstraction;

/**
 * @Author ChenHeWei
 * @Date 2023/2/17 14:31
 * @PackageName:com.cn.chw.abstraction
 * @ClassName: Outer
 * @Description: TODO
 * @Version 1.0
 */
//本类
public class Outer {

    //静态内部类
    static class Inter{
    }

    //内部类
    class mapper{
    }

    public void save(){
        //局部内部类
        class Name{
        }

        //局部内部类只能在局部使用外部不能使用。
        Name name = new Name();
    }

    public static void main(String[] args) {
        //静态内部类可以直接 new
        Inter inter = new Inter();

        //普通的内部类必须要先 new 本类 再 new 内部类
        mapper map = new Outer().new mapper();
        new Outer().save();
    }
}
