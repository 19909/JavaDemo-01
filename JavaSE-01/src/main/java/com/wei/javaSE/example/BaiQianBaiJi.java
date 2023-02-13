package com.wei.javaSE.example;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 14:54
 * @PackageName:com.wei.javaSE.example
 * @ClassName: BaiQianBaiJi
 * @Description: TODO
 * @Version 1.0
 */

public class BaiQianBaiJi {

    /**
     *  鸡翁 5钱一只
     *  鸡母 3钱一只
     *  鸡雏 1钱三只
     *  100钱 买 100只鸡
     */

    public static void main(String[] args) {

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
}
