package com.wei.fromt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 * @Author ChenHeWei
 * @Date 2023/2/9 18:39
 * @PackageName:com.wei.fromt
 * @ClassName: Demo04
 * @Description: TODO
 * @Version 1.0
 *      第四天作业
 */
public class Demo04 {

    //计算2023-1-1 这一天是星期几？
    public void calculate(){
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        String week = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA);
        System.out.println(localDate.getYear()+"这一天是"+week);
    }

    //计算两个日期之间有多少天？
    public void betweenAAndB(){
        LocalDate ofDate = LocalDate.of(2000, 1, 1);
        LocalDate now = LocalDate.now();
        //计算两个时间的天数
        long between = ChronoUnit.DAYS.between(ofDate, now);
        //格式化后的时间
        String ofDateFormat = ofDate.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        String nowFormat = now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println(ofDateFormat + "——" + nowFormat + "中间一共有" + between + "天");
    }

    //给定一个年份判断是否是闰年！！
    public void leapYear(){
        System.out.println("请输入一个年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year<=0 || year>Integer.MAX_VALUE){
            throw new RuntimeException("输入的年份不合法！");
        }else {
            //获取到输入的年份
            LocalDate ofYear = LocalDate.of(year, 1, 1);
            if (ofYear.isLeapYear()) {
                System.out.println("你输入的" + ofYear.getYear() + "年是闰年！");
            }else {
                System.out.println("你输入的" + ofYear.getYear() + "年不是闰年！");
            }
        }
    }

    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();

        //计算2023-1-1 这一天是星期几？
        //demo04.calculate();

        //计算两个日期之间有多少天？
        //demo04.betweenAAndB();

        //给定一个年份判断是否是闰年！！
        demo04.leapYear();

        //执行到这，就退出执行
        System.exit(0);
    }
}
