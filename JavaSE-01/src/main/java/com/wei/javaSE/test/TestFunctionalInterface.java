package com.wei.javaSE.test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenHeWei
 * @Date 2023/2/14 15:48
 * @PackageName:com.wei.javaSE.test
 * @ClassName: TestFunctionalInterface
 * @Description: TODO
 * @Version 1.0
 */

public class TestFunctionalInterface {

    public static void main(String[] args) {

//        new Thread(()-> System.out.println("你好!")).start();

        String [] atr = {"a","b","c","d","e","f"};
        List<String> asList = Arrays.asList(atr);
        asList.forEach(x->{
            System.out.println(x);
        });
    }
}
