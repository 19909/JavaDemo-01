package com.wei.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 19:20
 * @PackageName:com.wei.pojo
 * @ClassName: Demo06
 * @Description: TODO
 * @Version 1.0
 *      将当前时间的格式修改为     xxxx年xx月xx日 xx:xx:xx 星期几
 */
public class Demo06 {
    public static void main(String[] args) {


        //获取当前时间戳
        Date time = new Date();
        //周几
        int i = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 1;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(time);
        System.out.println("当前时间： " + format + "   星期" +i);
    }
}
