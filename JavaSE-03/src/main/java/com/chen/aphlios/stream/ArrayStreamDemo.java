package com.chen.aphlios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  10:48
 * @PackageName: com.chen.aphlios.stream
 * @ClassName: ArrayStreamDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class ArrayStreamDemo {
    public static void main(String[] args) {
        String[] str = new String[]{"Hello","eat","","ter","char","","name","query","bootStreap"};
        List<String> list = Arrays.asList(str);

//        Stream<String> stringStream = list.parallelStream();//并行流  用于多线程操作，

        Stream<String> stream = Arrays.stream(str);

//        List<String> list = stream.filter(s -> !s.isEmpty()).filter(s -> s.contains("e")).collect(Collectors.toList());

        stream.filter(a->!a.equals("Hello")).sorted().forEach(System.out::println);

        System.out.println("--------");
//        for (String s : list) {
//            System.out.println(s);
//        }

//        int sum = IntStream.rangeClosed(1,100).sum();

        //Stream的创建方式   1
        Stream<Object> of = Stream.of(1,2,3,5);
        //Stream的创建方式   2
        Stream<Integer> generate = Stream.generate(() -> {
            Random random = new Random();
            int i = random.nextInt(10);
            return i;
        }).limit(3);
        //Stream的创建方式   3
        Stream<Integer> integerStream = Stream.iterate(1, t -> t * t).limit(10);
        integerStream.forEach(System.out::println);
        Optional<Integer> any = Stream.iterate(5, t -> t * t).limit(10).findAny();  //返回流中数据的Optional对象

    }
}





















