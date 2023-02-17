package com.cn.chw.abstraction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenHeWei
 * @Date 2023/2/17 9:04
 * @PackageName:com.cn.chw.abstraction
 * @ClassName: FirstAbstraction
 * @Description: TODO
 * @Version 1.0
 */
public class FirstAbstraction {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<Object>();
        ArrayList<Object> arrayList = new ArrayList<>();

        System.out.println(list.getClass());
        System.out.println(arrayList.getClass());
    }
}
