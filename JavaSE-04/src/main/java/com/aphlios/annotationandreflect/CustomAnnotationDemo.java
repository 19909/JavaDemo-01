package com.aphlios.annotationandreflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  11:15
 * @PackageName: com.aphlios.annotationandreflect
 * @ClassName: CustomAnnotationDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
@User(id = 12,username = "Tom")
public class CustomAnnotationDemo {

    public void show(String str){
        System.out.println(str + "你好");
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        //反射获取到CustomAnnotationDemo类对象
        Class<CustomAnnotationDemo> annotationDemoClass = CustomAnnotationDemo.class;

        //拿到annotationDemoClass对象的构造方法
        Constructor<CustomAnnotationDemo> constructor = annotationDemoClass.getConstructor();
        CustomAnnotationDemo newInstance = constructor.newInstance();
        Method show = annotationDemoClass.getMethod("show", String.class);

        show.invoke(newInstance,"Tom");

//        //方式一
//        User annotation = annotationDemoClass.getAnnotation(User.class);    //通过类对象获取注解对象
//        System.out.println(annotation.id());    //通过注解对象获取属性值
//        System.out.println(annotation.username());
//
//        Field name = annotationDemoClass.getDeclaredField("username");
//        User annotation1 = name.getAnnotation(User.class);
//        System.out.println(annotation1.username());
//        System.out.println(annotation1.id());
//
//        //获取注解对象实例
//        Class<User> userClass = User.class;
//        if (userClass.isAnnotation()){
//            System.out.println(User.class+"是注解");
//        } else {
//            System.out.println(User.class+"不是注解");
//        }
    }
}
