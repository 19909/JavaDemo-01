package com.cn.chw.aphelios.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/23  13:51
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: ArraysDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class ArraysDemo {

    public static void arraysDemo(){
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"Tom",23));
        list.add(new Person(2,"Jack",19));
        list.add(new Person(3,"lun",20));
        list.add(new Person(4,"Aphlios",8));
        Arrays.sort(list.toArray());
        System.out.println(list);
    }

    public static void main(String[] args) {
        arraysDemo();
    }
}
