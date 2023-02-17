package com.cn.chw.demo;

import com.cn.chw.bean.Student;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 8:43
 * @PackageName:com.cn.chw.demo
 * @ClassName: TestSingleDemo
 * @Description: TODO
 * @Version 1.0
 */
public class TestSingleDemo {

    public static void main(String[] args) throws IOException {

        SingleObjectDemo instance = SingleObjectDemo.getInstance();
        SingleObjectDemo instance1 = SingleObjectDemo.getInstance();
        System.out.println(instance == instance1);

        instance.setName("你好");
        System.out.println(instance.getName());

        SingleObjectDemo single = SingleObjectDemo.single;
        System.out.println(instance == single);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        format.format(date);
        Student student = new Student().setId(12).setName("Tom").setDate(date);
        System.out.println(student);
    }
}

