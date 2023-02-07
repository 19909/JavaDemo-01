package com.wei.pojo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/7 17:49
 * @PackageName:com.wei.pojo
 * @ClassName: Demo04
 * @Description: TODO
 * @Version 1.0
 *
 */
//计算除数余数表达式
public class Demo04 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a % b == 0){
            System.out.printf("%2d ÷ %2d = %d",a,b,a/b);
        }else {
            System.out.printf("%2d ÷ %2d = %d .....%d%n",a,b,a/b,a%b);
        }
    }
}
