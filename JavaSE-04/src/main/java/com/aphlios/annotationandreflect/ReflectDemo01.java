package com.aphlios.annotationandreflect;

import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  9:16
 * @PackageName: com.aphlios.annotationandreflect
 * @ClassName: reflectDemo01
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *  @SuppressWarnings    表示用来指示编译器忽略注解中声明的警告。
 *  @Deprecated     标记过时方法，如果使用该方法，会报编译警告。
 *  @Override       检查该方法是否是重写方法。如果发现父类或者引用接口中没有该方法，会报编译错误。
 */

@RestController
//@SuppressWarnings(value = {"unused"})
public class ReflectDemo01 {


    @Deprecated //该注解表示该方法，已经不推荐使用
    public void show(){
        System.out.println("你好");
    }

    public void count(String ... strings){
        int length = strings.length;
        System.out.println(length);
        System.out.println("Hello");
    }

    public static void main(String[] args) {

//        Class<String> stringClass = String.class;
        ReflectDemo01 reflectDemo01 = new ReflectDemo01();

        System.out.println(Calendar.getInstance().getWeekYear());
        reflectDemo01.show();

    }
}
