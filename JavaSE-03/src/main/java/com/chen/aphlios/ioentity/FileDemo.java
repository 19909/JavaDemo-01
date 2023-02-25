package com.chen.aphlios.ioentity;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/24  13:50
 * @PackageName: com.chen.aphlios.ioentity
 * @ClassName: FileDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 */
public class FileDemo {

    static Map<String,Integer> map = new HashMap<>();

    //获取有多少个文件
    public int getCount(String str){
        return this.getCount(new File(str));
    }
    public int getCount(File file){
        String[] list = file.list();
        int count = 0;
        for (String s : list){
            int lastIndexOf = s.lastIndexOf(".");
            String substring = s.substring(lastIndexOf);
            if (substring.contains("java")){
                ++count;
                System.out.println(s);
            }
        }
        return count;
    }


    //判断改文件中有多少类型的文件
    public static void getNumberType(File file){

        if (file.isFile()) {
            String name = file.getName();   //文件名
            String substring = name.substring(name.lastIndexOf(".")+1); //后缀
            if (map.containsKey(substring)){
                map.put(substring,map.get(substring)+1);
            } else {
                map.put(substring,1);
            }
        } else {
            try {
                File[] files = file.listFiles();
                if (files != null){
                    for (File file1 : files) {
                        if (file1.isDirectory()) getNumberType(file1);
                        String toLowerCase = file1.getName().toLowerCase(); //获取文件名
                        String substring = toLowerCase.substring(toLowerCase.lastIndexOf(".") + 1); //获取文件名后缀

                        if (map.containsKey(substring)){
                            map.put(substring,map.get(substring)+1);
                        } else {
                            map.put(substring,1);
                        }
                    }
                }
//                System.out.println(map);
            } catch (Exception e){
            }
        }
    }
    public void getNumberType(String str){
        getNumberType(new File(str));
    }

    //递归遍历目录
    public static void catalogCount(File file){
        if (file.exists()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) catalogCount(f);
                    getNumberType(f);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileDemo fileDemo = new FileDemo();
//        fileDemo.getCount("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01\\JavaSE-03\\src\\main\\java\\com\\chen\\aphlios\\ioentity");
        catalogCount(new File("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01"));
        System.out.println(map);
    }
}
