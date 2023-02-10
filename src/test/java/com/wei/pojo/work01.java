package com.wei.pojo;

import org.junit.Test;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 20:11
 * @PackageName:com.wei.pojo
 * @ClassName: work01
 * @Description: TODO
 * @Version 1.0
 */

public class work01 {

    /**     Date工具包
     * 在JDK 1.1之前， Date有两个附加功能。 它允许将日期解释为年，月，日，小时，分钟和第二个值。 它还允许格式化和解析日期字符串。
     * 不幸的是，这些功能的API不适合国际化。 从JDK 1.1开始， Calendar类应该用于在日期和时间字段之间进行转换，并且DateFormat类应用于格式化和解析日期字符串。
     * 在相应的方法Date被弃用。
     *
     * 尽管Date类旨在反映协调的世界时间（UTC），但根据Java虚拟机的主机环境的不同，可能不会这样做。
     * 几乎所有的现代操作系统都假设在所有情况下1天= 24×60×60 = 86400秒。
     * 然而，在UTC的时候，大概每一两年会有一秒钟的时间，叫做“闰秒”。 闰秒总是作为一天的最后一秒，总是在12月31日或6月30日。
     * 例如，1995年的最后一分钟是61秒，由于增加了闰秒。 大多数计算机时钟不够准确，不能反映出闰秒的区别。
     */

    @Test
    public void test01(){
        //获取当前时间戳（三种）
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(new Date().getTime());

        //获取实例对象
        Calendar calendar = Calendar.getInstance();
        //Calendar类 转换为 Date类
        Date date = calendar.getTime();

        //calendar.set();
        //calendar.get();
        //calendar.add();
        calendar.add(Calendar.DATE,-7);


    }

    @Test
    public void test02(){

        //1、实例化日历类
        Calendar instance = Calendar.getInstance();
        //得到一个Date实例，将Calendar转换成Date类
        Date time = instance.getTime();
        //
        System.out.println(instance.get(Calendar.YEAR));    //年
        System.out.println(instance.get(Calendar.MONTH) + 1);   //月
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));    //日
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));     //时
        System.out.println(instance.get(Calendar.MINUTE));          //分
        System.out.println(instance.get(Calendar.SECOND));          //秒
        System.out.println(instance.get(Calendar.DAY_OF_WEEK) - 1); //周几


        long timeMillis = System.currentTimeMillis();
        System.out.printf("%tF %<tT%n",timeMillis);//使用时间戳输出一个完整的时间。

        Date date = new Date(2000 - 1900, 5 - 1, 2, 10, 20, 30);
        long dateTime = date.getTime();//出生时的时间戳
        System.out.println("一共活了"+(System.currentTimeMillis() - dateTime) / (1000 * 60 * 60 * 24)+"天");//一共活了多少天
    }

    @Test
    public void test3(){
        //获取到Calendar实例
        Calendar instance = Calendar.getInstance();
        //获取到当前时间的时间戳
        System.out.println(instance.getTimeInMillis());
        //将Calendar实例转换成Date实例
        Date time = instance.getTime();
        //想Calendar实例中设置时间
//        instance.set();
        //获取当前时间的小时段，24小时制
        int hour = instance.get(Calendar.HOUR_OF_DAY);
        //获取当前时间的小时段，12小时制
        int hour1 = instance.get(Calendar.HOUR);
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));

        //获取时区
        System.out.println(instance.getTimeZone());
    }

    @Test
    public void test4(){
        /**
         *      图形页面输入
         */
        String n = JOptionPane.showInputDialog("请输入姓名:");
        System.out.println(n);
        int age = Integer.parseInt(JOptionPane.showInputDialog("请输入年龄:",18));
        System.out.printf("欢迎：%s，年龄：%d岁。%n",n,age);
    }

    @Test
    public void test5(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate of = LocalDate.of(2020, 10, 30);
        System.out.println(of);
        DayOfWeek dayOfWeek = of.getDayOfWeek();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.CHINA));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.CHINA));

        System.out.println(of.isLeapYear());//判断当前年份是否是闰年
    }

    @Test
    public void test6(){

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

    @Test
    public void test7(){
        //Date
        Date date = new Date();
        System.out.println(date);   //Thu Feb 09 19:13:57 CST 2023
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));  //2023年02月09日 19时29分21秒
        System.out.println(dateFormat.format(date));    //2023-02-09

        //Calendar
        Calendar instance = Calendar.getInstance();
        System.out.printf("%tF%n",instance);  //2023-02-09 （格式化输出）

        //LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now);    //2023-02-09

        //LocalTime
        LocalTime time = LocalTime.now();
        System.out.println(time);   //19:18:20.444
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));   //19:21:21  （格式化输出）

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);      //2023-02-09T19:37:17.570
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"))); //2023年02月09日 19时38分42秒 (格式化输出)
    }
}




























