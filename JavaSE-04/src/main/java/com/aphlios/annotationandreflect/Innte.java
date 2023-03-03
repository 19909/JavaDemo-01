package com.aphlios.annotationandreflect;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  10:08
 * @PackageName: com.aphlios.annotationandreflect
 * @ClassName: Innte
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
@SuppressWarnings("all")    //镇压所有的警告。
@FunctionalInterface        //函数式接口，表示可以用Lambda表达式。如果接口找只有一个方法，该注解可以不写。
public interface Innte {
    int show(int a,int b);
}
