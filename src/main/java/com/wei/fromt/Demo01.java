package com.wei.fromt;

/**
 * @Author ChenHeWei
 * @Date 2023/2/8 10:06
 * @PackageName:com.wei.fromt
 * @ClassName: Demo01
 * @Description: TODO
 * @Version 1.0
 *      逻辑运算符
 */
public class Demo01 {

    public static void main(String[] args) {

        //逻辑运算 与 && & 或 || | 非 ! 异或 ^
        //true && 支持短路效率高 & 不支持短路效率低
        System.out.println(true && true);   //true
        System.out.println(true & true);    //true
        //false
        System.out.println(true && false);  //false
        System.out.println(true & false);   //false
        System.out.println(false && true);  //false
        System.out.println(false & true);   //false
        System.out.println(false && false); //false
        System.out.println(false & false);  //false
//        System.out.println("-".repeat(30));
        int a = 1;
        int b = 2;
        //&&支持短路 false 1 2
        //boolean f = a==2 && ++b == 2;
        //&不支持短路 false 1 3
        boolean f = a==2 & ++b == 2;
        System.out.println(f);      //false
        System.out.println(a);      //1
        System.out.println(b);      //2
//        System.out.println("*".repeat(35));
        //|| 逻辑或 |
        System.out.println(true||true);     //true
        System.out.println(true||false);    //true
        System.out.println(false||true);    //true
        System.out.println(false||false);   //false
//        System.out.println("*".repeat(35));
        //^ 逻辑异或
        System.out.println(true^true);      //false
        System.out.println(true^false);     //true
        System.out.println(false^true);     //true
        System.out.println(false^false);    //false
        //逻辑非 ！
//        System.out.println("*".repeat(35));
        System.out.println(!!false && !(3==2));     //false
        System.out.println(!false && !(3==2));      //true
        System.out.println(true && true);           //true


        System.out.println("--------------------");
        String num = "OK";
        String mun = "OK";
        // == 基本数据类型比较的是值
        System.out.println(num == mun);

        String s = new String("name");
        String s1 = new String("name");
        //引用数据类型比较的是内存地址
        System.out.println(s == s1);

        //如果想要比较字符串的值可以使用equals
        System.out.println(s.equals(s1));
    }
}
