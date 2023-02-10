package com.wei.pojo;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @Author ChenHeWei
 * @Date 2023/2/9 11:52
 * @PackageName:com.wei.pojo
 * @ClassName: Demo11
 * @Description: TODO
 * @Version 1.0
 *          日期类     LocalDate       LocalTime
 */
public class Demo11 {

    public static void main(String[] args) {
        /**
         *      LocalDate 类
         */
        //获取当前日期实例
        LocalDate localDate = LocalDate.now();
        //向当前日期实例中设置日期
        LocalDate newLocalDate = LocalDate.of(2000, 3, 2);

        //当前时间的5天后
        System.out.println(localDate.plusDays(5L));
        //当前时间的3天前
        System.out.println(localDate.minusDays(3L));

        //当前时间的25个月后的日期
        System.out.println(localDate.plus(25, ChronoUnit.MONTHS));
        //当前时间的15个月之前的日期
        System.out.println(localDate.minus(15, ChronoUnit.MONTHS));

        //获取年份
        System.out.println(newLocalDate.getYear()+"new");
        System.out.println(localDate.getYear());

        //获取月份
        String displayName = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINA);
        String displayName1 = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINESE);
        System.out.println(displayName);
        System.out.println(displayName1);
        System.out.println(newLocalDate.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINESE)+"new");

        //获取当前月份的第几天
        System.out.println(localDate.getDayOfMonth());
        System.out.println(newLocalDate.getDayOfMonth()+"new");

        //获取当前年份的第几天
        System.out.println(localDate.getDayOfYear());
        System.out.println(newLocalDate.getDayOfYear()+"new");
        //获取周几
        System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINESE));
        System.out.println(newLocalDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINESE)+"new");

        //直接输出日期
        System.out.println(localDate);
        System.out.println(newLocalDate);
        //格式化输出日期
        System.out.printf("%tF%n",localDate);
        System.out.printf("%tF%n",newLocalDate);
        System.out.printf("%tY年%<tm月%<td日 %<tA%n",localDate);
        System.out.printf("%tY年%<tm月%<td日 %<tA%n",newLocalDate);

        //判断当前年份是否为闰年
        System.out.println(localDate.getYear()+"是不是闰年"+localDate.isLeapYear());
        System.out.println(newLocalDate.getYear()+"是不是闰年"+newLocalDate.isLeapYear());

    }
}
