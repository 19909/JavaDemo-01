package com.chen.aphlios.iobufferedentity;

import com.chen.aphlios.ioentity.FileDemo;

import java.io.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/27  16:22
 * @PackageName: com.chen.aphlios.iobufferedentity
 * @ClassName: FileAddToMoreoverDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      将指定路径下所有的java文件全部弄到一个文件
 *
 */
public class FileAddToMoreoverDemo {

    //读取一个文件 + 行号
    public static void bufferReadLineMethod(String str){
        try (
                FileReader fileReader = new FileReader(str);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
                ){

            int count = 0;
            while (bufferedReader.ready()) {
                System.out.println(++count+". "+bufferedReader.readLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //遍历目录
    public static File count(File file){
        if (file.isDirectory()) count(file);
        return file;
    }
    //将指定文件追加到另一个文件中
    public static void circulationCatalog(File file,File dis){

        int count = 0;

        //如果dis文件不存在，则递归创建
        if (!dis.exists()){
            dis.mkdirs();
        }

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(dis,true);   //true 设置追加
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ){
            if (file.exists()){
                if (file.isFile() && file.getName().endsWith(".java")){

                    while (bufferedReader.ready()) {
                        //读一行，写入一行
                        bufferedWriter.write(++count+". "+bufferedReader.readLine() + "\r\n");
                    }
                } else {

                    FileDemo.catalogCount(file);

/*                    File[] files = file.listFiles();
                    for (File f : files) {
                        //递归追加文件内容
                        if (f.isDirectory()) {
//                            count(f);
                            circulationCatalog(f,dis);
                        }
                        if (f.getName().endsWith(".java")){
                            while (bufferedReader.ready()) {
                                //读一行，写入一行
                                bufferedWriter.write(++count+". "+bufferedReader.readLine());
                            }
                        }
                    }*/
                }

            } else {
                throw new RuntimeException("你输入的文件不存在");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //-----------------------------

    //将一个文件追加到另一个文件后
    public static void append(String src,String dst){
        try (
                FileReader fileReader = new FileReader(src);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(dst,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ){
            int rows = 0;
            while (bufferedReader.ready()) {
                bufferedWriter.write(++rows + ". " + bufferedReader.readLine() + "\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void countMethod(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) countMethod(f);
            if (f.isFile() && f.getName().endsWith(".java")){
                append(f.getAbsolutePath(),"D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\src.txt");
            }
        }
    }
    public static void main(String[] args) {
        countMethod(new File("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01"));
    }
}
