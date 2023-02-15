package com.wei.javaSE.work;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/14 17:30
 * @PackageName:com.wei.javaSE.work
 * @ClassName: Work03
 * @Description: TODO
 * @Version 1.0
 */
public class Work03 {


    public void bubbleSort(int[] array){
        System.out.println("原数组："+ Arrays.toString(array));
        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j<array.length - 1 - i; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的数组："+Arrays.toString(array));
    }

    public void numberSort(){
        Integer[] array = {10,7,9,11,5,16,49,34};
        System.out.println("排序前：" + Arrays.toString(array));

        //升序
        Arrays.sort(array);
        System.out.println("升序后：" + Arrays.toString(array));
        //降序
        Arrays.sort(array,(a,b)-> b-a);
        System.out.println("降序后：" + Arrays.toString(array));

        //乱序
    }

    public static void main(String[] args) {

        Work03 work03 = new Work03();
        //初始化数组
        int[] array = {10,7,9,11,5,16,49,34};
//        work03.bubbleSort(array);
        work03.numberSort();
    }
}
