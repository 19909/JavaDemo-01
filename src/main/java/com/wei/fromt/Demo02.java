package com.wei.fromt;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author ChenHeWei
 * @Date 2023/2/8 10:53
 * @PackageName:com.wei.fromt
 * @ClassName: Demo02
 * @Description: TODO
 * @Version 1.0
 *
 *          第三天作业
 */
public class Demo02 {

    //编写一个分时问候的程序案例
    public void extend(){
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

    //计算两个日期之间的天数 1989-10-15 出生 到目前生活了多少天？
    public void aBetweenB(){
        Calendar instance = Calendar.getInstance();
        instance.set(1989, Calendar.OCTOBER,15);
        long begin = instance.getTimeInMillis();
        //1989-10-15 当天的时间戳
        long odd = new Date().getTime();    //现在的时间戳
        System.out.println("1989-10-15 出生到目前生活了"+(odd-begin)/(1000*60*60*24)+"天");
    }
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        //时间问好
        demo02.extend();
        //两个时间之间差多少天
        demo02.aBetweenB();
    }
}
