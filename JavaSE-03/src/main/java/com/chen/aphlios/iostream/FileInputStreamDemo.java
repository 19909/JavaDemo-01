package com.chen.aphlios.iostream;

import java.io.*;
import java.nio.file.Path;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/25  11:34
 * @PackageName: com.chen.aphlios.iostream
 * @ClassName: FileInputStreamDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      FileInputStream的使用
 */
public class FileInputStreamDemo {
    //读取指定文件文件中的内容。
    public void readDemo(String str) throws IOException {
        try {
            FileInputStream inputStream = new FileInputStream(str);
            byte[] buf = new byte[1024];
            int length = 0;
            if ((length = inputStream.read(buf)) != -1){
                System.out.println(new String(buf));
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("指定的文件不存在或者指定的不是文件。");
        }
    }

    //文件重命名 + 文件移动
    public void renNameDemo(){
        File file = new File("neme.txt");
        //将一个文件重命名 + 修改名字。
        boolean rename = file.renameTo(new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\copy.txt"));
    }

    //讲一个文件中的内容追加到另外一个文件。
    public void autoClose(File dir, File dst){
        try (FileOutputStream fileOutputStream = new FileOutputStream(dst,true);
             FileInputStream fileInputStream = new FileInputStream(dir)
        ){
            byte[] bytes = new byte[2048];
            int length = 0;
            if ((length = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        FileInputStreamDemo inputStreamDemo = new FileInputStreamDemo();
        inputStreamDemo.readDemo("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\copy.txt");
        inputStreamDemo.renNameDemo();
        inputStreamDemo.autoClose(new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\copy.txt"),
                new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\Test.txt"));
    }
}
