package com.cn.chw.aphelios.character;

import java.util.Arrays;

/**
 * @Author ChenHeWei
 * @Date 2023/2/21 14:19
 * @PackageName:com.cn.chw.aphelios.character
 * @ClassName: AphliosRegularStringMethodDemo
 * @Description: TODO
 * @Version 1.0
 *
 *      //      String对象支持正则的方法
 */
public class AphliosRegularStringMethodDemo {

    public static void main(String[] args) {
        String world = "12Hello00World258";
        System.out.println("原字符串 : " +world);

        /**
         * 替换条件可以换成正则表达式
         *      replaceAll
         *      replaceFirst
         *      split
         *      matches
         */

        //支持正则表达式
        String replaceAll = world.replaceAll("[a-z]+", "-");    //将全部的小写字母替换成 - 。输出
        System.out.println("将全部的小写字母替换成 - :"+replaceAll);
        //没有贪婪模式
        String all = world.replaceAll("\\d", "-");
        System.out.println(all);
        //有贪婪模式
        System.out.println(world.replaceAll("\\d+", "-"));
        //清除贪婪模式
        System.out.println(world.replaceAll("\\d+?", "-"));

        String replaceFirst = world.replaceFirst("\\d+", "MybatisPlus--");  //替换第一次出现满足条件的
        System.out.println("替换第一次出现满足条件的 : "+replaceFirst);

        String[] split = world.split("00");     //以00 为分隔符拆分字符串
        System.out.println("以00 为分隔符拆分字符串 :"+Arrays.toString(split));

        String[] aphliosSplit = world.split("\\d+");    //为任意相连数字为分隔符拆分字符串
        System.out.println("为任意相连数字为分隔符拆分字符串 :"+Arrays.toString(aphliosSplit));

        System.out.println("判断给定的字符串中是否有数字 :"+world.matches(".*\\d.*"));   //判断给定的字符串中是否有数字

    }
}
