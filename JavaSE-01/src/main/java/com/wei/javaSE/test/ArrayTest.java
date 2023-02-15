package com.wei.javaSE.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author ChenHeWei
 * @Date 2023/2/14 8:36
 * @PackageName:com.wei.javaSE.test
 * @ClassName: ArrayTest
 * @Description: TODO
 * @Version 1.0
 *
 *      数组练习    --->>工具类 Arrays类
 */
public class ArrayTest {
    /**
     *  Arrays.asList(atr); //根据指定数组的大小，返回固定长度的List集合。
     *  Arrays.binarySearch(atr, "d");  //  使用二叉搜索算法搜索指定数组的范围。
     *  Arrays.copyOf(atr, 6);  //根据指定数组，复制指定长度的数组到新的数组当中去（可以自动填充）
     *  Arrays.copyOfRange(atr, 0, 2);  //根据指定数组的下标范围生成一个新的数组
     *  Arrays.deepEquals(atr, copyOf); //传入两个数组如果两个数组的深度相同，则返回true，否则返回false。
     *  Arrays.deepToString(copyOfRange); //返回指定数组的“深度内容”的字符串表示形式。
     *  Arrays.fill(arr,7);   //给指定的数组填充某个值。
     *  Arrays.fill(arr,0,3,6); //给指定数组中下标从0到2之间的数填充为6。
     * @param args
     */
    public static void main(String[] args) {
        String [] atr = {"a","b","c","d","e","f"};

        List<String> asList = Arrays.asList(atr);

        List<String> list = Arrays.asList(atr);
        System.out.println(list);

        int binarySearch = Arrays.binarySearch(atr, "d");
        System.out.println(binarySearch);

        String[] copyOf = Arrays.copyOf(atr, 6);
        System.out.println("新数组的长度:" + copyOf.length);
        for (String s : copyOf) {
            System.out.printf("%s \t",s);
        }

        System.out.println();

        String[] copyOfRange = Arrays.copyOfRange(atr, 0, 2);
        System.out.println("新数组的长度:" + copyOfRange.length);
        for (String s : copyOfRange) {
            System.out.printf("%s \t",s);
        }
        System.out.println();

        boolean deepEquals = Arrays.deepEquals(atr, copyOf);
        System.out.println(deepEquals);

        System.out.println(Arrays.deepToString(copyOfRange));

        int [] arr = {1,2,3,4,5,6};
        Arrays.fill(arr,7);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,0,3,6);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
