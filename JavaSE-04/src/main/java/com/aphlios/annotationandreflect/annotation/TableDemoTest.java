package com.aphlios.annotationandreflect.annotation;

import java.lang.annotation.Annotation;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  19:39
 * @PackageName: com.aphlios.annotationandreflect.annotation
 * @ClassName: TableDemoTest
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      注解通过反射来读取注解里面的属性
 */
public class TableDemoTest {

    public static void main(String[] args) {
        Class<TableDemo> tableDemoClass = TableDemo.class;
        Annotation[] annotations = tableDemoClass.getAnnotations();
        System.out.println(annotations.length);
        Table table = tableDemoClass.getAnnotation(Table.class);
        System.out.println(table.id());
        System.out.println(table.name());
    }
}
