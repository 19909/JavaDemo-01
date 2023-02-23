package com.cn.chw.aphelios.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/22  21:20
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: HashMapDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      Map 接口  、 HashMap 实现类
 */
public class HashMapDemo {



    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //添加键值对
        map.put("name","Tom");
        map.put("age","18");
        map.put("hobby","游泳健身");
        map.put("noodle","炸酱面");
        map.put("address","河南省郑州市");

        //根据 Key 的值获取 Value
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("address"));

        //修改
        map.replace("name", "jack");    //通过key  修改 value
        System.out.println(map.get("name"));

        map.replace("userName","tome"); //通过不存在的Key 去修改 value  不会出现异常，但是为什么呢？
        System.out.println(map.get("userName"));    //我们取的话，取出来的是 null ,是一个空值。

        //删除键值对
        map.remove("age");
        boolean remove = map.remove("hobby", "游泳健身1");  //根据 key 和 value 删除键值对，如果删除成功返回true，否则返回false
        System.out.println(remove);

        //通过指定的 key 找到一对键值对，进行操作，可以是函数式接口。
//        map.compute("hobby",(key,value)-> {});        //总之一句话，就是找到键值对后对键值对进行操作。

//        map.clear();    //清空键值对集合

        //根据指定的Key和Value去判断Map集合中是否存在，如果存在返回true，否则返回false
        System.out.println(map.containsKey("name"));//true
        System.out.println(map.containsKey("name12"));//false
        System.out.println(map.containsValue("Tom"));//false
        System.out.println(map.containsValue("Tom12"));//false

        //将一个map集合转化成 Set集合
//        Set<Map.Entry<String, String>> set = map.entrySet();

        //根据指定的Key去获得元素，如果在map中没有获取到该Key对应的Value，则给该Key一个默认值。
        System.out.println(map.getOrDefault("name", "jack11"));
        System.out.println(map.getOrDefault("name1", "jack11"));

        //判断map集合是否为空，如果为空返回true，否则返回false
        System.out.println(map.isEmpty());

        //将map集合中所有的Key转化成一个Set集合。
//        Set<String> keySet = map.keySet();

        //获取map集合中键值对的个数。
        System.out.println(map.size());

        System.out.println(map.values().toString());    //获取全部的 Value

        System.out.println("==================");

        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.hashMapTest();
    }

    public void hashMapTest(){
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","18");
        map.put("hobby","游泳健身");
        map.put("noodle","炸酱面");
        map.put("address","河南省郑州市");
        System.out.println("原集合："+map);

        //
        Object clone = map.clone();
        System.out.println("浅拷贝HashMap集合："+clone);

    }
}
