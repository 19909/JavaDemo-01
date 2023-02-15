package com.wei.javaSE.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 17:38
 * @PackageName:com.wei.javaSE.work
 * @ClassName: Work02
 * @Description: TODO
 * @Version 1.0
 *
 */
public class Work02 {

    //输出菱形
    public void rhombus(){
        int s = 10;
        for (int i = 1; i < 10; i+=2) {
            s--;
            for (int t = s; t>=1 ; t--){
                System.out.print(" ");
            }
            for (int n = 1; n<= i ; n++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 7; i >=1; i-=2) {
            s++;
            for (int t = s; t>=1 ; t--){
                System.out.print(" ");
            }
            for (int n = 1; n<= i ; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //猜数字游戏
    public void numberGameMather(){
        while (true){
            System.out.println("请输入0-10之间的数字：");
            Scanner scanner = new Scanner(System.in);
            int nextInt = scanner.nextInt();
            int X = 6;
            if (nextInt == X){
                System.out.printf("\033[31m恭喜你猜中了\033[0m%n");
                break;
            }else {
                System.out.printf("\033[34m很遗憾，你没有猜中了\033[0m%n");
            }
        }
    }

    //九九乘法表
    public void multiplication(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d\t",i,j,i*j);
            }
            System.out.println();
        }
    }

    //分时问候
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

    //百鸡百钱
    public void baiJi(){
        int i;  //鸡翁
        int j;  //鸡母
        int k;  //鸡雏

        System.out.println("以下是百鸡百钱的问题答案");
        for (i = 0; i <= 20 ; i++){   //鸡翁
            for (j = 0 ; j < 34 ; j++){ //鸡母
                for (k = 0; k <=300 ; k+=3){    //鸡雏
                    if ((i+j+k == 100) && (5*i + j*3 + k/3 ==100)){
                        //百鸡百钱答案
                        System.out.println("公鸡：" + i +"  母鸡：" + j + "  鸡雏 ：" + k);
                    }
                }
            }
        }
    }

    //根据指定的年月输出该月有多少天
    public void appoint(){
        while (true){
        System.out.print("请输入年份:");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();  //年
        System.out.print("请输入月份[1-12]:");
        int second = scanner.nextInt(); //月
        if (first<0){
            throw new RuntimeException("下标异常！");
        } else {
            if (second>0 && second<=12){
                LocalDate localDate = LocalDate.of(first, second, 1);   //指定日期
                switch (second){
                    case 1 :
                    case 3 :
                    case 5 :
                    case 7 :
                    case 8 :
                    case 10 :
                    case 12 :
                        System.out.println(first+ "年" + second+ "月一共有31天");
                        break;
                    case 4 :
                    case 6 :
                    case 9 :
                    case 11 :
                        System.out.println(first+ "年" + second+ "月一共有30天");
                        break;
                    case 2 :
                        System.out.println(first+ "年" + second+ "月一共有"+(localDate.isLeapYear() ? 29 : 28)+"天");
                        break;
                }
            } else {
                throw new RuntimeException("下标异常！");
            }
        }
        }
    }

    //随机生成2023-1-1 0：0：0 到 现在的随机日期10个？
    public void randomDay() throws ParseException {
        //格式化Date日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2023-1-1 0:0:0");   //指定日期
        long time = date.getTime();     //指定日期的时间戳
        long timeMillis = System.currentTimeMillis();   //系统当前时间的时间戳

        for (int i = 0; i < 10; i++) {
            long random = (long) (Math.random()*(timeMillis-time) + time);
            System.out.println(simpleDateFormat.format(random));
        }
    }

    //微信信息时间显示效果
    //讲
    public void weCharTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse("2023-2-14 11:12:00");
            long time = date.getTime();//获取当时的时间戳
            long timeMillis = System.currentTimeMillis();//获取当前系统的时间撮
//            60*1000
            long l = timeMillis - time;
            if (l< 60*100 && l>0){
                System.out.println(simpleDateFormat.format(date) + "刚刚");
            } else if (l < 60*60*100) {
                System.out.println((new Date(timeMillis).getMinutes()-date.getMinutes()) + "分钟前");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws ParseException {
        Work02 work02 = new Work02();
        //随机生成2023-1-1 0：0：0 到 现在的随机日期10个？
//        work02.randomDay();
        //输出菱形
//        work02.rhombus();
        //猜数字游戏
//        work02.numberGameMather();
        //九九乘法表
//        work02.multiplication();
        //分时问候
//        work02.extend();
        //百鸡百钱
//        work02.baiJi();
        //根据指定的年月输出该月有多少天
//        work02.appoint();


//        work02.weCharTime();
    }
}
