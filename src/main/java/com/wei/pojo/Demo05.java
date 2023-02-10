package com.wei.pojo;

import java.util.Calendar;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 18:47
 * @PackageName:com.wei.pojo
 * @ClassName: Demo05
 * @Description: TODO
 * @Version 1.0
 *      时间格式
 */
public class Demo05 {
    public static void main(String[] args) {

/*        int hours = new Date().getHours();
        System.out.println(hours);
        System.out.println("------");

        int i = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        System.out.println(i);*/
        //获取当前时间的小时部分
        int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        System.out.println("当前时间为 ： " + h + "时");
            //0-5凌晨   5-8早上    8-11上午   11-14中午   14-18下午   18-24晚上   24=0 凌晨
            if (h == 24){
                System.out.println("凌晨好！");
            }else if (h>=0 && h<5){
                System.out.println("凌晨好！");
            } else if (h>=5 && h<8){
                System.out.println("早上好！");
            }else if (h>=8 && h<11){
                System.out.println("上午好！");
            }else if (h>=11 && h<14){
                System.out.println("中午好！");
            }else if (h>=14 && h<18){
                System.out.println("下午好！");
            }else {
                System.out.println("晚上好！");
            }

    }
}
