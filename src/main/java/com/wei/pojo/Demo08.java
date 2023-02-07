package com.wei.pojo;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 19:52
 * @PackageName:com.wei.pojo
 * @ClassName: Demo08
 * @Description: TODO
 * @Version 1.0
 *      计算5天前，6天后日期，指定月份1号，最后一天日期
 */
public class Demo08 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.printf("%tF %n",now);
        System.out.printf("%tF %n",now.minusDays(5));
        System.out.printf("%tF %n",now.plusDays(6));
        //当月1号日期
        System.out.printf("%tF %n",now.minusDays(now.getDayOfMonth()-1));
        System.out.printf("%tF %n",now.with(TemporalAdjusters.firstDayOfMonth()));
        //当前的最后一天日期
        System.out.printf("%tF %n",now.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
