package com.cn.chw.aphelios.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/22  15:25
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: ArrayListDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      List 接口  、  ArrayList 实现类
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        //用法和ArrayList一样，区别就是ArrayList支持单线程、Vector支持多线程。
        List<Integer> list = new ArrayList<>();
        //增加元素
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list.toString());
        System.out.println("集合的大小："+list.size());
        //获得元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println("------");

        //修改
        System.out.println(list.get(list.indexOf(15)));
        list.set(list.indexOf(15), 155);
        System.out.println(list.get(list.indexOf(155)));
        System.out.println("----");

        //判断
        System.out.println("------");
        System.out.println(list.contains(15));
        System.out.println(list.contains(155));
        //判断是否为空
        System.out.println(list.isEmpty());
        //获取集合大小
        System.out.println(list.size());
        System.out.println("------");

        //删除元素
        Integer i = 155;
        System.out.println(list.remove(i)); //删除指定元素内容
        System.out.println(list.remove(list.size() - 1));//删除指定下标的元素
        //list.removeAll(list的子集);  //删除list集合中的子集
        //list.clear(); //清空集合
        System.out.println("------");

        //遍历
        list.forEach(System.out::println);

        for (Integer integer:list){
            System.out.printf("list[%d]=%d  ",list.indexOf(integer),integer);
        }
        System.out.println();
        //将数据翻转遍历
        Collections.reverse(list);
        for (Integer integer : list){
            System.out.printf("list[%d]=%d  ",list.indexOf(integer),integer);
        }
        System.out.println();
        System.out.println("-------");
        //排序升序
        Collections.sort(list);
        for (Integer integer : list){
            System.out.printf("list[%d]=%d  ",list.indexOf(integer),integer);
        }
        System.out.println();
        //降序
        list.sort((a, b) -> b - a);
        for (Integer integer : list){
            System.out.printf("list[%d]=%d  ",list.indexOf(integer),integer);
        }
        System.out.println();
        //乱序
        Collections.shuffle(list);
        Collections.shuffle(list);
        Collections.shuffle(list);
        Collections.shuffle(list);
        Collections.shuffle(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
