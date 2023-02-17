package com.cn.chw.aphelios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 16:04
 * @PackageName:com.cn.chw.aphelios
 * @ClassName: StreamDemo
 * @Description: TODO
 * @Version 1.0
 *
 *      测试流的使用（数组转成流）
 */
public class StreamDemo {

    /**
     *
     * @param args
     *
     * 什么是Stream
     *  Stream是JDK8中引入的，Stream是一个来自数据源的元素序列并支持聚合操作。可以让你以一种声明的方式处理数据，Stream使用一种类似用SQL语句从数据库查询数据的直观方式来提供
     *  一种对java集合运算和表达的高阶抽象。Stream API可以极大提高Java程序员的生产力，让程序员写出高效、干净、简洁的代码。
     *  Stream特点
           元素：是特定类型的对象，形成的一个序列。Stream并不会存储元素，而是按需计算。
           数据源：流的来源可以是集合、数组、I/O channel等。
           过滤、聚合、排序等操作：类似SQL语句一样的操作，比如filter,map,reduce,find,sorted等。
           流水线/管道：中间操作都会返回流对象本身。这样多个操作可以串联成一个管道，如同流式风格。这样做可以对操作进行优化，比如延迟执行和短路（类似 && 和 || 的作用）
           内部迭代：以前对集合遍历都是通过迭代器或者Foreach的方式，显然这是在集合外部进行迭代。Stream提供了内部迭代的方式，使遍历的效率更高。
          只能遍历一次：数据流的从头获取数据源，在流水线上以此对元素进行操作，当元素通过流水线，便无法在对其进行操作。
     *
       一个Stream是由三个部分组成的。数据源-->零个或一个或多个中间操作--->一个或零个终止操作。
       中间操作是对数据的加工，注意：中间操作是lazy（懒加载）操作，并不会立马启动，需要等待有一个或多个终止操作才会执行。
       终止操作就是Stream的启动操作，只有加上终止操作，Stream才会真正的开始执行。
     *
     *
     */

    public static void main(String[] args) {
        String[] ls = new String[]{"age", "eat", "tea", "tan", "ate", "nat", "bat", "book", "bkoo"};

        //Stream创建流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //数组转换成流
        Stream<String> stream = Arrays.stream(ls);
        //集合转换成流
        List<String> list = Arrays.asList(ls);
        Stream<String> listStream = list.stream();

        //通过创建数据获取流
        //iterate生成的数据从几开始，生成数据的规则是什么
        Stream<Integer> limit = Stream.iterate(0, (x) -> x + 2).limit(5);
        limit.forEach(System.out::println);

        //通过生成器
        Stream<Double> generate = Stream.generate(Math::random).limit(3);   //随机产生小数
        generate.forEach(System.out::println);

        /**
         *  中间操作：
               filter:过滤流中的某些数据
               limit(n) : 获取前n个元素
               skip(n) :方法表示跳过前n条元素
               distinct: 通过流中的hashCode() 和 equals() 去重。
         *
           映射：
               map 和 flatMap
               map 函数传入的lambda表达式就是我们的转换逻辑，需要返回一个转换后的元素
               flatMap 将每个元素转换成一个stream流
                   注意：flatMap 和 map函数对比两者传入的lambda都是转换逻辑，但是map中的lambda表达式返回的是一个转换后的新元素，
                        flatMap可以把返回的元素做进一步的处理，例如 将{"a,b,c","1,2,3"}中的"a,b,c"进一步的分隔成a b c 元素 返回的是这三个元素形成
                           的三个stream流，最终把这些单独的stream流合并成一个stream流返回，
                   {"a,b,c","1,2,3"}这个例子来说
                       map 可以把它变成 {"abc","123"} 返回
                       flatMap 可以把它变成 {"a","b","c","1","2","3"} 返回
         */

    }
}
