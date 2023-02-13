package com.wei.pojo;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 8:26
 * @PackageName:com.wei.pojo
 * @ClassName: Demo13
 * @Description: TODO
 * @Version 1.0
 *
 *      localDateTime
 */
public class Demo13 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.get(ChronoField.YEAR));    //获取年份
        System.out.println(localDateTime.get(ChronoField.NANO_OF_SECOND));  //获取时间戳
//        System.out.println(localDateTime.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY));
        System.out.println(localDateTime.getMinute());  //获取分钟
        System.out.println(localDateTime.getHour());    //获取小时
        System.out.println(localDateTime.getDayOfMonth());  //获取日
        System.out.println(localDateTime.getMonthValue());      //获取月份的数字
        System.out.println(localDateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINA));      //获取二月份
        System.out.println(localDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));  //获取周几
        System.out.println(localDateTime.getDayOfYear());   //获取当天在本年中的第几天
    }
}
