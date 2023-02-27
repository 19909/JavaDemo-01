package com.chen.aphlios.iobufferedentity;

import com.chen.aphlios.iobufferedentity.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/27  10:08
 * @PackageName: com.chen.aphlios.iobufferedentity
 * @ClassName: ObjectStreamDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class ObjectStreamDemo {

    //文件中的对象读到java程序中去
    public void readObjectStream(File file) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    }

    //将java对象写入磁盘文件中
    public void writeObjectStream(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        //将对象保存到List集合中
        List<Book> list = new ArrayList<>();
        list.add(new Book(412825,"《java程序设计》","郑州市"));
        list.add(new Book(147258,"《C语言程序设计》","郑州市高新区"));

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(147258,"《数据库程序设计》","郑州市"));
        bookList.add(new Book(123456,"《Mysql数据库》","郑州"));

        //将保存好的List集合写入Map集合中
        Map<String,List<Book>> map = new HashMap<>();
        map.put("list",list);
        map.put("bookList",bookList);
        objectOutputStream.writeObject(map);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectStreamDemo stream = new ObjectStreamDemo();
        stream.writeObjectStream(new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\object.txt"));
        stream.readObjectStream(new File("D:\\JavaEE\\Java培训学习资料\\笔记+资料\\FileDemo\\object.txt"));
    }
}
