package com.chen.aphlios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/28  15:23
 * @PackageName: com.chen.aphlios.stream
 * @ClassName: SecondStreamDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class SecondStreamDemo {

    static String[] str = new String[]{"bat", "eat","tan", "eat", "nat", "bat", "back"};

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 2, 3, 4, 6};
        SecondStreamDemo secondStreamDemo = new SecondStreamDemo();
        secondStreamDemo.sortedDemo(integers);
    }
    //排序升序
    public void sortedDemo(Integer[] str){
        Stream<Integer> stream = Arrays.stream(str);
        stream.sorted().forEach(System.out::println); //结束语句已执行流就会关闭。
    }
    //排序降序
    public void sortedDemo(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 2, 3, 4, 6);
        stream.sorted((a,b)-> b-a).forEach(System.out::println);
    }

    public void mapDemo(){
        //  map 将流中的数据处理后返回一个元素
        Stream<String> stringStream = Stream.of("a,b,c", "d,f,g");
        stringStream.map(x->x.replaceAll(",","")).forEach(e->{
            System.out.printf("%s%n",e);
        }); //abc dfg
    }

    public void flatMapDemo(){
        //  flatMap 将流中的数据处理后还能在返回一个流。
        Stream<String> stringStream1 = Stream.of("a,b,c", "d,f,g");
        stringStream1.flatMap(x->{
            String[] split = x.split(",");
            return Arrays.stream(split);
        }).map(x->x.replaceAll(",","")).forEach(System.out::println);//a b c d f g
    }


}
