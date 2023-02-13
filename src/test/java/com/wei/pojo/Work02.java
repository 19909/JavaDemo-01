package com.wei.pojo;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/10 14:57
 * @PackageName:com.wei.pojo
 * @ClassName: Work02
 * @Description: TODO
 * @Version 1.0
 */
public class Work02 {

    @Test
    public void text01(){
        //生成Random实例
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
        int anInt = random.nextInt(3);
        System.out.print(anInt);

        }
    }

    @Test
    public void text02(){
        Random random = new Random();
        final int win = 7;    //中奖号码
        int myWinH = random.nextInt(100) + 1;
        //中奖率 1%
        if (win == myWinH){
                        System.out.println("你的号码 ：" + myWinH + " 在本次活动中中奖了");
        }else {
                        System.out.println("你的号码 ：" + myWinH + " 在本次活动中没有中奖了");
        }
    }

    //冒泡排序
    @Test
    public void bubbleSort(){

        int[] array = {10,7,9,11,5,16,49,34};
        System.out.println("原数组："+Arrays.toString(array));
        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j<array.length - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的数组："+Arrays.toString(array));
    }

    @Test
    public void test03(){
        //数组的常用方法
        int[] arr = {4,12,45,78,3,17,5,13,2};

        /**
         * 数组中的常用方法
         *  clone()     将调用该方法的数组复制一份，返回给新的数组。
         *  equals()    判断两个数组对象是否相同
         *  Arrays.equals(arr, clone)   借助工具类 Arrays，使用equals()方法比较的是数组中的元素是否相同。
         *  hashCode()  根据某个数组对象返回哈希值
         *  Arrays.hashCode()   根据指定数组中内容返回哈希值。
         *  toString()  返回对象的字符串表达式。
         *  Arrays.toString()   将指定数组的内容以字符串的形式输出。
         */
        int[] clone = arr.clone();
        System.out.println(Arrays.toString(clone));
        System.out.println(clone.length);

        System.out.println(arr.equals(clone));  //false
        System.out.println(Arrays.equals(arr, clone));  //true

        int hashCode = arr.hashCode();
        System.out.println(hashCode);
        int code = Arrays.hashCode(arr);
        System.out.println(code);

        String string = arr.toString();
        System.out.println(string);
        String toString = Arrays.toString(arr);
        System.out.println(toString);
        System.out.println("-------------");
//        Class<? extends int[]> aClass = arr.getClass();
//        System.out.println(arr.getClass().getName());

        /**
         *  Arrays.asList(stringArray)  返回一个集合对象
         *  toArray() 集合对象转化成数组。
         *  Arrays.sort(arr);   将对象名为arr的数组升序排序
         */

        String[] stringArray = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b);// true
//        Arrays.sort(stringArray);
//        System.out.println(Arrays.toString(stringArray));

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);
        System.out.println(arrayList.contains("s"));    //判断集合中是否含有 "s",有 返回 true  没有 返回 false
        System.out.println(arrayList.contains("a"));
        String[] stringArr = new String[arrayList.size()];
        String[] toArray = arrayList.toArray(stringArr);
        for (String s : toArray) {
            System.out.println(s);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,10);
        Arrays.fill(arr,1,3,120); //    赋值语句 下标在1 - 3 的数据赋值为120。
        System.out.println(Arrays.toString(arr));
    }
}
