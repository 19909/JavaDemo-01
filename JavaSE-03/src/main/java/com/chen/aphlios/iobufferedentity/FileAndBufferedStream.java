package com.chen.aphlios.iobufferedentity;

import java.io.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/27  8:51
 * @PackageName: com.chen.aphlios.iobufferedentity
 * @ClassName: FileAndBufferedStream
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      缓冲字节流
 */
public class FileAndBufferedStream {

    public static void bufferStream(File file) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            long timeMillis = System.currentTimeMillis();
            byte[] bytes = new byte[1];
            int len = 0;
            if ((len = fileInputStream.read(bytes)) != -1){ }
            long l = System.currentTimeMillis();
            System.out.println(l-timeMillis);

            long l1 = System.currentTimeMillis();
            if ((len = bufferedInputStream.read()) != -1){}
            System.out.println(System.currentTimeMillis()-l1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
//        bufferStream(new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\object.txt"));

    }
}
