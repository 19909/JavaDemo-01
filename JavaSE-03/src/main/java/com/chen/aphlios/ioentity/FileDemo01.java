package com.chen.aphlios.ioentity;

import java.io.File;
import java.io.IOException;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/24  10:11
 * @PackageName: com.chen.aphlios.ioentity
 * @ClassName: FileDemo01
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      文件的操作  File  FileReader     FileInputStream
 */
public class FileDemo01 {

    //输入一个文件名，创建文件对象，路径是当前项目的根目录。
    public void filePathName(){
        File file = new File("a.txt");
        if (file.exists()) {
            boolean delete = file.delete();
            System.out.println(file.getName() + "文件删除了");
        } else {
            try {
                boolean fileNewFile = file.createNewFile();
                System.out.println(file.getName()+"文件创建了");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //根据一个File对象中的路径和子文件名创建一个File实例。
    public void fileParentCreateChild(){
        File file = new File("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01\\JavaSE-03");
        File fileChild = new File(file, "a.txt");

        if (fileChild.exists()) {
            fileChild.delete();
            System.out.println(fileChild.getName()+"文件删除了");
        } else {
            try {
                fileChild.createNewFile();
                System.out.println(fileChild.getName()+"文件创建了");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    //根据指定目录创建文件,在该目录下创建文件
    public void fileStringParentCreateChild(){
        File file = new File("D:\\JavaEE\\Java培训学习资料\\代码\\JavaDemo-01\\JavaSE-03", "child.txt");
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName()+"文件删除了");
        } else {
            try {
                file.createNewFile();
                System.out.println(file.getName()+"文件创建了");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        FileDemo01 fileDemo = new FileDemo01();
//        fileDemo.filePathName();
        fileDemo.fileParentCreateChild();
//        fileDemo.fileStringParentCreateChild();
    }
}
