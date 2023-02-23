package com.cn.chw.aphelios.collection;

import java.util.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/23  9:28
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: HashSetDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      Set 接口    、  HashSet 实现类
 */
public class HashSetDemo {

    public void setTest(){
        Set<String> set = new HashSet<>();
        //添加
        set.add("name");
        set.add("age");
        System.out.println(set);
        //添加一组 传入一个集合
        String[] strings = new String[]{"hobby","address","phone"};
//        Integer[] integers = new Integer[]{0,1,2,3,4};
        set.addAll(Arrays.asList(strings));

        //清空 Set 集合
//        set.clear();

        //判断改元素在集合中是否存在，如果存在返回true,如果不存在返回false。
        boolean contains = set.contains("age");
        boolean contain = set.contains("ages");
        //判断传入的集合是否是原集合的子集，如果是返回true，如果不是返回false
        boolean containsAll = set.containsAll(Arrays.asList(new String[]{"nihao", "weiwei"}));
        boolean containAll = set.containsAll(Arrays.asList(strings));

        //判断是否为空，集合为空返回true，否则返回false
        System.out.println(set.isEmpty());

        //删除一个指定的元素
        set.remove("name");

        //删除原集合和传入集合的交集
        boolean removeAll = set.removeAll(Arrays.asList(new String[]{"nihao", "weiwei", "age", "ages"}));

        //返回集合的大小
        int size = set.size();

        Iterator<String> iterator = set.iterator();


        //将该集合转换成数组
        Object[] toArray = set.toArray();

    }

    public static void main(String[] args) {
        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.setTest();
    }
}
