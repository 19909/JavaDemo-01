package com.cn.chw.aphelios;

import java.time.LocalDate;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 14:25
 * @PackageName:com.cn.chw.aphelios
 * @ClassName: PrimeNumber
 * @Description: TODO
 * @Version 1.0
 *
 */
public class PrimeNumber {

    public void number(){
        //素数就是只能被1和自身整除的数，如:  2、3、5、7、11、13、17、19、23
        int sum = 0;
        int k = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                k = 0;
                if (i % j == 0) {
                    k = 1;//如果不为素数就赋值为1，否则初始为0
                    break;//不为素数就结束里面这层for循环
                }
            }
            if (k == 0)//得出素数，这里可以对素数打印、求和
                sum += i;
        }
        System.out.println(sum);
    }

    public void time(){
        //编程打印出2000 到 现在年份闰年
        LocalDate localDate = LocalDate.of(2000, 1, 1);
        LocalDate localDate1 = LocalDate.now();
        int year = localDate.getYear();
        int nowYear = localDate1.getYear();
        for (int i = year; i <= nowYear; i++) {
            LocalDate of = LocalDate.of(i, 1, 1);
            if (of.isLeapYear()) {
                System.out.println(i + "年是闰年");
            }
        }
    }

    public void zone(){
        //编程代码实现打印菱形效果图案
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

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
//        primeNumber.time();
//        primeNumber.zone();
        primeNumber.number();
    }

}
