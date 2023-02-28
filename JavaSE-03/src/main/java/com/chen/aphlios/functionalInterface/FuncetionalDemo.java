package com.chen.aphlios.functionalInterface;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  10:35
 * @PackageName: com.chen.aphlios.functionalInterface
 * @ClassName: FuncetionalDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class FuncetionalDemo {

    public static void main(String[] args) {

        /**
         * (a,b)-> a*b 相当于实现类中的实现。其功能主要是为了简化实现
         */
        LambdaFuncetinal lambdaFuncetinal = (a,b)-> a*b;
        System.out.println(lambdaFuncetinal.copy(12, 2));

    }

}
