package com.chen.aphlios.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/25  14:03
 * @PackageName: com.chen.aphlios.iostream
 * @ClassName: FileOutputStreamDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\Test.txt";
        try {
            //new FileOutputStream(path,true) 第二个参数表示是否是往文件中追加，默认是false 表示不追加（覆盖） ，true表示往文件的最后面追加内容。
            FileOutputStream outputStream = new FileOutputStream(path);
            String b = "Hello World！你好！";
            outputStream.write(b.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
