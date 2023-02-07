package com.wei.pojo;

import java.util.Calendar;
import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 19:54
 * @PackageName:com.wei.pojo
 * @ClassName: Demo09
 * @Description: TODO
 * @Version 1.0
 *
 *      生成指定范围的随机日期对象2000-01-01 00：00：00 - now
 */
public class Demo09 {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2000, 1 - 1, 1, 0, 0, 0);
        Calendar c2 = Calendar.getInstance();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
//            long time = rand.nextLong(c1.getTimeInMillis(),c2.getTimeInMillis());
//            System.out.printf("%tF %<tT%n", time);
        }
    }
}
