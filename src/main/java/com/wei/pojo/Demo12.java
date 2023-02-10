package com.wei.pojo;

import java.time.LocalTime;

/**
 * @Author ChenHeWei
 * @Date 2023/2/9 17:37
 * @PackageName:com.wei.pojo
 * @ClassName: Demo12
 * @Description: TODO
 * @Version 1.0
 */
public class Demo12 {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime ofTime = LocalTime.of(12, 2, 23, 24);
        System.out.println(now);
        System.out.println(ofTime);
    }
}
