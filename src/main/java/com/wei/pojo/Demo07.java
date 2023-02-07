package com.wei.pojo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 19:47
 * @PackageName:com.wei.pojo
 * @ClassName: Demo07
 * @Description: TODO
 * @Version 1.0
 *      计算两个日期之间的天数
 */
public class Demo07 {

    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.of(2001, 10, 5, 8, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        long data = ChronoUnit.DAYS.between(a, now);
        System.out.printf("%tF %<tT 到 %tF %<tT 之间有 %d 天",a,now,data);

    }
}
