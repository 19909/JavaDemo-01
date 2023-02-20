package com.cn.chw.aphelios.character;

import java.util.Locale;

/**
 * @Author ChenHeWei
 * @Date 2023/2/20 11:06
 * @PackageName:com.cn.chw.aphelios.character
 * @ClassName: StringDemo01
 * @Description: TODO
 * @Version 1.0
 *
 *      字符串的基本操作（常用方法）
 */
public class StringDemo {

    public static void main(String[] args) {
        String name = "Hello World Is My";
        String name1 = "   Hello World Is My   ";
        System.out.println(name1);
        //清除左边和右边的空字符
        String trim = name1.trim();
        System.out.println(trim);

        //清除所有空字符
        System.out.println(name1.replace(" ", ""));

        //转换成ASCII码表中对应的数字。
        byte[] trimBytes = name.getBytes();
        for (byte trimByte : trimBytes) {
            System.out.println(trimByte);
        }
        //判断字符串是否有长度，如果有长度返回false，没有长度返回true
        System.out.println(name.isEmpty());

        //将字符串转化成小写
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.CHINA));
        System.out.println("原字符串 ： " + name);

        //将字符串转化成大写
        System.out.println(name.toUpperCase());
        System.out.println("原字符串 ： " + name);

        //获取字符串的长度
        System.out.println("字符串的长度是 ："+ name.length());

        //判断字符串中是否含有某些字段，区分大小写
        System.out.println(name.contains("a"));
        System.out.println(name.contains("S"));
        System.out.println(name.contains("s"));

        //将指定字符串进行替换
        System.out.println(name.replace("e", "a"));
        System.out.println(name.replace(" ", ""));

        //向字符串尾部追加元素。
        System.out.println(name.concat("batis"));

        //int参数是从第几个字符开始返回剩下的字符
        System.out.println(name.substring(0));//Hello World Is My
        System.out.println(name.substring(1));//ello World Is My
        System.out.println(name.substring(2));//llo World Is My
        System.out.println(name.substring(3));//lo World Is My
        System.out.println(name.substring(4));//o World Is My
        System.out.println("------");
        System.out.println(name);//Hello World Is My
        System.out.println(name.substring(0, 4));//Hell
        System.out.println(name.substring(1, 4));//ell
        System.out.println(name.substring(2, 4));//ll
        System.out.println(name.substring(3, 4));//l

        //字符串比较忽略大小写
        System.out.println(name.equalsIgnoreCase("Hello"));
        System.out.println(name.equalsIgnoreCase("HELLO WORLD IS MY"));

        System.out.println("-------");
        //字符串比较不忽略大小写
        System.out.println(name.equals("HELLO WORLD IS MY"));
        System.out.println("--------");

        System.out.println(name);
        //根据指定的符号分隔字符串
        String[] split = name.split(" ");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
