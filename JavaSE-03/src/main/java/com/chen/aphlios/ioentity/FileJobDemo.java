package com.chen.aphlios.ioentity;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/24  21:12
 * @PackageName: com.chen.aphlios.ioentity
 * @ClassName: FileJobDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class FileJobDemo {

    static int num = 0;
    static int count = 0;
    //判断有多少Java文件   ----->成功
    public static void count(File file) throws IOException {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                count(f);
            } else {
                String lowerCase = f.getName().toLowerCase();//获取文件名
                String substring = lowerCase.substring(lowerCase.lastIndexOf(".") + 1);
                if ("java".equals(substring)){
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
                    String readLine = bufferedReader.readLine();

                    ++num;
                    System.out.println(lowerCase);
                }
            }
        }
    }

    //判断两个文件是否是相同的  ----->>成功
    public static void differentAndEqual(File begin,File end) throws IOException {
        FileInputStream beginInputStream = new FileInputStream(begin);  //第一个文件
        FileInputStream endInputStream = new FileInputStream(end);  //第二个文件
        int beginLength = beginInputStream.available();
        int endLength = endInputStream.available();
        if (beginLength == endLength){  //长度相同才有可能文件相同
            //创建缓冲区
            byte[] beBytes = new byte[beginLength];
            byte[] enBytes = new byte[endLength];
            //将两个文件的内容读入缓冲区
            beginInputStream.read(beBytes);
            endInputStream.read(enBytes);
            //判断文件中的字节是否是相同的
            for (int i = 0; i < beginLength; i++) {
                //判断字节是否相同
                if (beBytes[i] != enBytes[i]){
                    System.out.println("两个文件的内容不相同");
                    break;
                }
            }
            System.out.println("两个文件相同");

        }  else {
            System.out.println("两个文件不相同");
        }
    }

    //识别一个文件的格式 ----->>成功
    public static void formt(File file){
        Map<String,String> map = new HashMap<>();
        if (file.isFile()){
            String lowerCase = file.getName().toLowerCase();
            String suf = lowerCase.substring(lowerCase.lastIndexOf(".") + 1);
            if (map.containsKey(suf)){
                System.out.println(lowerCase + " ： 文件是以" + suf + "结尾的文件");
            } else {
                map.put(suf,suf);
                System.out.println(lowerCase + " ： 文件是以" + suf + "结尾的文件");
            }
        } else {
            throw new RuntimeException("你输入文件没有找到或不是文件。");
        }
    }

    //判断一共有多少行代码    ----->>成功
    public static void tongJiDemo(File file) throws IOException {

        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                tongJiDemo(file1);
            }
        }   else if (file.getName().endsWith("java")){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.readLine() != null){
                ++count;
            }

        }
    }

    public static void main(String[] args) throws IOException {

/*
        //计算工程下一共有多少.java文件。
        File file = new File("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01");
        count(file);
        System.out.println("一共有"+num+"个java文件");
*/

/*
        //判断两个文件是否是相同的
        differentAndEqual(new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\平时作业\\day02作业.txt"),
                new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\平时作业\\day02作业.txt"));
*/

/*
        //识别一个文件的格式
        formt(new File("D:\\\\JavaEE\\\\Java培训学习资料\\\\笔记+资料\\\\平时作业\\\\day03作业.txt"));
*/

/*        //计算一共有多少行代码！
        File file = new File("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01");
        tongJiDemo(file);
        System.out.println("该工程下一共有"+count + "行代码！！");
*/
    }
}
