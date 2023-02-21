package com.cn.chw.aphelios.character;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenHeWei
 * @Date 2023/2/21 11:18
 * @PackageName:com.cn.chw.aphelios.character
 * @ClassName: AphliosRegularDemo
 * @Description: TODO
 * @Version 1.0
 *
 *      正则表达式    Pattern类   Matcher类的使用
 */
public class AphliosRegularDemo {
    public static void main(String[] args) {
        String name = "1990945244@qq.com";
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(name);

        boolean matches = matcher.matches();
        System.out.println(matches);

        System.out.println(Pattern.matches("1\\d{9}@[a-zA-Z]+.com", name));

        Matcher m25e689 = Pattern.compile("\\d+").matcher("n12a14m25e689");
        System.out.println(m25e689.find());//find方法进行匹配的字符可以在字符串任何位置
        System.out.println(m25e689.start());//1 返回第一个子串的索引
        System.out.println(m25e689.end());//3   返回第一个子串后面的索引
        System.out.println(m25e689.group());//12    返回第一个子串

    }
}
