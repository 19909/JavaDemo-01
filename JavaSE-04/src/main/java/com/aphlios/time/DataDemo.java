package com.aphlios.time;

import java.time.Clock;
import java.time.Instant;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  19:23
 * @PackageName: com.aphlios.time
 * @ClassName: DataDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class DataDemo {
    /**
     * java.util.Date 日期类
     * java.util.Calendar 日历
     * java.text.SimpleDateFormat 格式化类
     * java.time.LocalDate 年月日
     * java.time.LocalTime 时分秒
     * java.time.LocalDateTime 年月日时分秒
     * java.time.format.DateTimeFormatter 格式化 日期 时间 日期时间
     */

    public void instant(){
        //Instant类的构造方法私有化，可以根据里面的静态方法来获取一个Instant实例。
        Instant now = Instant.now();
        System.out.println(now);
    }

    public static void main(String[] args) {
    }
}
