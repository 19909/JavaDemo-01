package com.cn.chw.aphelios;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 19:19
 * @PackageName:com.cn.chw.aphelios
 * @ClassName: StreamDemoTest
 * @Description: TODO
 * @Version 1.0
 */
public class StreamDemoTest {

    public static void main(String[] args) {

/*        String[] ls = new String[]{"age", "eat", "", "tan", "ate", "nat", "bat", "", "back"};
        //原数组
        System.out.println(Arrays.toString(ls));
        //生成列表
        List<String> list = Arrays.asList(ls);
        //使用流的技术来过滤数据
        List<String> collect = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);*/

/*        String[] ls = new String[]{"age", "eat","tan", "ate", "nat", "bat", "back"};
        //原数组
        System.out.println(Arrays.toString(ls));
        //生成列表
        List<String> list = Arrays.asList(ls);
        //使用流的技术来过滤数据
        List<String> collect = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);*/

/*        String[] ls = new String[]{"age", "eat","tan", "ate", "nat", "bat", "back"};
        //原数组
        System.out.println(Arrays.toString(ls));
        //生成列表
        List<String> list = Arrays.asList(ls);
        //使用流的技术来过滤数据
        List<String> collect = list.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println(collect);*/

/*        String[] ls = new String[]{"bat", "eat","tan", "eat", "nat", "bat", "back"};
        //原数组
        System.out.println(Arrays.toString(ls));
        //生成列表
        List<String> list = Arrays.asList(ls);
        //使用流的技术来过滤数据
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);*/

/**
 *                map 和 flatMap
 *                map 函数传入的lambda表达式就是我们的转换逻辑，需要返回一个转换后的元素
 *                flatMap 将每个元素转换成一个stream流
 *                    注意：flatMap 和 map函数对比两者传入的lambda都是转换逻辑，但是map中的lambda表达式返回的是一个转换后的新元素，
 *                         flatMap可以把返回的元素做进一步的处理，例如 将{"a,b,c","1,2,3"}中的"a,b,c"进一步的分隔成a b c 元素 返回的是这三个元素形成
 *                            的三个stream流，最终把这些单独的stream流合并成一个stream流返回，
 *                    {"a,b,c","1,2,3"}这个例子来说
 *                        map 可以把它变成 {"abc","123"} 返回
 *                        flatMap 可以把它变成 {"a","b","c","1","2","3"} 返回
 */


/*        List<String> list = Arrays.asList("a,b,c", "1,2,3");
        Stream<String> stream = list.stream().map(s -> s.replaceAll(",", ""));
        stream.forEach(System.out::println);    //abc  123*/


        List<String> list = Arrays.asList("a,b,c", "1,2,3");
        Stream<String> stream = list.stream().flatMap(x->{
            String[] split = x.split(",");
            Stream<String> str2 = Arrays.stream(split);
            return str2;
        });
        stream.forEach(System.out::println);    //a b c 1 2 3


    }
}
