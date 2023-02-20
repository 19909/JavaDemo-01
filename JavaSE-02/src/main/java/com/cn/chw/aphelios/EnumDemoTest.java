package com.cn.chw.aphelios;

/**
 * @Author ChenHeWei
 * @Date 2023/2/18 9:20
 * @PackageName:com.cn.chw.aphelios
 * @ClassName: EnumDemoTest
 * @Description: TODO
 * @Version 1.0
 */
public class EnumDemoTest {


    public static void main(String[] args) {
        EnumDemo success = EnumDemo.SUCCESS;
        System.out.println(success);
        System.out.println(success.getCode());
        System.out.println(success.getMessage());
        String s = "123JavaScript".replaceAll("\\d+", "-");
        System.out.println();
    }
}
