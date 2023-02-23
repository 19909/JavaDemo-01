package com.cn.chw.aphelios.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/23  10:57
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: TreeSetDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      Set 接口  、  TreeSet 实现类
 */
public class TreeSetDemo {

    public void treeSetTest(){
        //降序排序
        Set<Student> treeSet = new TreeSet<>((a,b)-> b.compareTo(a));
        treeSet.add(new Student(1,"张三",90));
        treeSet.add(new Student(2,"李四",95));
        treeSet.add(new Student(3,"王五",82));
        treeSet.add(new Student(4,"赵丽",53));

        System.out.println(treeSet);
    }

    public static void main(String[] args) {
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.treeSetTest();
    }
}
