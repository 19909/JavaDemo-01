package com.aphlios.annotationandreflect.annotation;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  17:05
 * @PackageName: com.aphlios.annotationandreflect.annotation
 * @ClassName: TableDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
@Table(id = 12,name = "Tom")
public class TableDemo {

    public void show(){
        System.out.println("你好!");
    }

}
