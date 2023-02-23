package com.cn.chw.aphelios.Exception;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/22  8:37
 * @PackageName: com.cn.chw.aphelios.Exception
 * @ClassName: FirstException
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      异常的使用
 */
public class FirstException {
    /**
     *      Exception 异常层次结构的根类
     *      RuntimeException 运行时异常，多数 java.lang 异常的根类
     *      ArithmeticException 算术谱误异常，如以零做除数
     *      ArrayIndexOutOfBoundException 数组大小小于或大于实际的数组大小
     *      NullPointerException 尝试访问 null 对象成员，空指针异常
     *      ClassNotFoundException 不能加载所需的类
     *      NumberFormatException 数字转化格式异常，比如字符串到 float 型数字的转换无效
     *      IOException I/O 异常的根类
     *      FileNotFoundException 找不到文件
     *      EOFException 文件结束
     *      InterruptedException 线程中断
     *      IllegalArgumentException 方法接收到非法参数
     *      ClassCastException 类型转换异常
     *      SQLException 操作数据库异常
     */

    public static void main(String[] args) {
        getNumber();
    }

    public static void getNumber(){
        System.out.print("请输入"+1+"-"+10+"之间的整数：");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int nextInt = new Random().nextInt(10) + 1; //中奖数字

        try {
            number = scanner.nextInt(); //用户输入
            while (true){
                if (nextInt == number){
                    System.out.print("\033[32m猜对了！\033[0m");
                    break;
                } else {
                    System.out.print("\033[31m猜错了！\033[0m");   //红色
                    System.out.println();
                    System.out.print("请重新输入"+1+"-"+10+"之间的整数：");
                    number = scanner.nextInt();
                    continue;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("程序出现了错误！！！");
        } finally {
            System.out.println("finally语句块会在 catch 语句执行后执行 finally 语句块");
        }
    }
}
