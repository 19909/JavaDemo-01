package com.cn.chw.aphelios.character;

/**
 * @Author ChenHeWei
 * @Date 2023/2/20 11:07
 * @PackageName:com.cn.chw.aphelios.character
 * @ClassName: StringBuilterDemo
 * @Description: TODO
 * @Version 1.0
 *
 *      StringBuilder的使用（常用方法）
 */
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder hello_world = stringBuilder.append("Hello World");

        System.out.println(hello_world);
        hello_world.append(12);
        System.out.println(hello_world);
        System.out.println("--------");

//        实例化一个可变字符串的初始长度
        StringBuilder st = new StringBuilder(12);
        System.out.println(st.insert(0, "Eval"));
        System.out.println(st.length());
        System.out.println(st.append("public StringBuffer"));
        System.out.println(st.length());
        //删除指定下标的字符串
        System.out.println("删除指定下标的字符串"+st.delete(0, st.length()));
        System.out.println("向该字符串中追加字符"+st.append("public StringBuffer"));
        //删除指定下标位置的字符。
        System.out.println("删除指定下标位置的字符"+st.deleteCharAt(6));
        System.out.println("--------");

//        初始化一个可变长度的 "Hello 你好" 的字符串。
        StringBuilder builder = new StringBuilder("Hello 你好");
        System.out.println(builder);
        System.out.println(builder.length());
        builder.append(15);
        System.out.println(builder);
        System.out.println(builder.length());

    }
}
