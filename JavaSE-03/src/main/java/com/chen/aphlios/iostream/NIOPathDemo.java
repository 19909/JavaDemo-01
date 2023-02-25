package com.chen.aphlios.iostream;

import java.io.IOException;
import java.nio.file.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/25  10:15
 * @PackageName: com.chen.aphlios.iostream
 * @ClassName: NIOPathDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      Path对象
 */
public class NIOPathDemo {
    public static void main(String[] args) throws IOException {
        //final类Paths的两个static方法，如何从一个路径字符串来构造Path对象
        Path path = Paths.get("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\平时作业\\day15作业.txt");  //文件对象或者是文件夹对象

        Path fileName = path.getFileName();
        System.out.println(fileName);   // 获取文件名        day15作业.txt

        System.out.println(path.getName(0));    //返回指定路径位置的Path的对象，从左往右从0开始   ---> 以此类推

        System.out.println(path.getNameCount());    //返回 路径中目录和文件的个数        5

        System.out.println(path.getParent());       //返回父目录 ， 如果没有返回null    D:\JavaEE\Java培训学习资料\笔记+资料\平时作业

        System.out.println(path.endsWith("java"));  //返回该路径中是否以给定字符串结尾  是返回true ，不是返回false

        FileSystem fileSystem = path.getFileSystem();
        System.out.println(fileSystem);     //返回创建此对象的操作系统      sun.nio.fs.WindowsFileSystem@1d44bcfa

        System.out.println(path.getRoot()); //返回路径中的根目录         D:\

        System.out.println(path.isAbsolute());  //判断改路径对象是否是绝对路径    是返回ture，不是返回false

        System.out.println(path.normalize());   //D:\JavaEE\Java培训学习资料\笔记+资料\平时作业

        System.out.println(path.startsWith("D:\\JavaEE"));  //判断Path对象中的路径是否是以给定的路径开头

        System.out.println(path.toFile());  //Path对象向File对象转化

        System.out.println(path.toUri());   //返回一个URL来表示此路径         file:///D:/JavaEE/Java培训学习资料/笔记+资料/平时作业/day15作业.txt

        System.out.println("--------------");
        //FileSystems构造出Path对象
        Path systemsPath = FileSystems.getDefault().getPath("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\平时作业\\day15作业.txt");
        System.out.println(systemsPath.getClass());
/*
        //读取文件内容    join格式
        String collect = Files.newBufferedReader(Paths.get("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\平时作业\\day15作业.txt")).lines().collect(Collectors.joining("\n"));
        System.out.println(collect);
*/

/*        //读取文件内容    数组格式
        List<String> collect = Files.newBufferedReader(path).lines().collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }
*/
    }
}
