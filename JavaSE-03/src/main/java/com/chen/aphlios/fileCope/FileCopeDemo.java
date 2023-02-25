package com.chen.aphlios.fileCope;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/24  17:12
 * @PackageName: com.chen.aphlios.fileCope
 * @ClassName: FileCopeDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      图片的拷贝
 */
public class FileCopeDemo {

    static List<String> types = new ArrayList<>(Arrays.asList("jpg","webp","png","jfif"));  //文件名后缀
    static long num = 0;//文件名的前缀索引

    //拷贝文件  第一个参数是原文件，第二个参数是目标地址（拷贝到哪个地方）
    public static void count(File dir,File dst){
        //目标目录不存在
        if (!dst.exists()) {
            dst.mkdirs();
        }
        //判断是否是文件夹
        if (dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            for (File listFile : listFiles) {
                //判断是否是目录
                if (listFile.isDirectory()) {
                    count(listFile,dst);
                }
                String toLowerCase = listFile.getName().toLowerCase();
                String substring = toLowerCase.substring(toLowerCase.lastIndexOf(".") + 1);
                if (types.contains(substring)) {
                    copePicture(listFile,new File(dst,String.format("wx_%03d.%s",++num,substring)));
                }
            }
        } else {//不是文件夹就是文件
            String toLowerCase = dir.getName().toLowerCase();
            String substring = toLowerCase.substring(toLowerCase.lastIndexOf(".") + 1);
            copePicture(dir,new File(dst,String.format("wx_%03d.%s",++num,substring)));
        }
    }
    //将一个文件或者目录复制到另一个目录，使用三个重载的方法
    public static void copePicture(File inputStream, File outputStream) {
        copePicture(inputStream,outputStream,8192);
    }
    //重载的 int 属性是控制一次读取的字节数。
    public static void copePicture(File file,File end,int size) {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(end);
            byte[] bytes = new byte[size];
            int length = 0;
            while ((length = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,length);
            }
        }catch (Exception e){
        }
    }

    public static void main(String[] args) {

//        count(new File("D:\\BaiduNetdiskDownload\\picture"),new File("webp"));

    }
}
