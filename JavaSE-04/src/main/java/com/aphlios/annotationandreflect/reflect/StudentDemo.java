package com.aphlios.annotationandreflect.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  15:00
 * @PackageName: com.aphlios.annotationandreflect.reflect
 * @ClassName: StudentDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      通过反射获取类中的 构造器、自己定义的方法、公共方法、属性、执行方法
 *
 */
@SuppressWarnings("all")        //镇压所有警告
public class StudentDemo {

    public static void main(String[] args) throws Exception{
        //通过反射获取到类对象
        Class<Student> studentClass = Student.class;

        //获取全部的构造器
        Constructor<?>[] constructors = studentClass.getConstructors();
        System.out.println("全部的构造器有:" + constructors.length + "个");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + "  " + constructor.getParameterTypes().toString());
        }
        System.out.println("----------------------------");

        //获取当前类自己定义的方法
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        System.out.println("自己定义的方法：" + declaredMethods.length + "个");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + " " +declaredMethod.getParameters());
        }
        System.out.println("----------------------------");

        //获取当前类公共的方法
        Method[] methods = studentClass.getMethods();
        System.out.println("公共的方法：" + methods.length + "个");
        for (Method declaredMethod : methods) {
            System.out.println(declaredMethod.getName() + " " +declaredMethod.getParameters());
        }
        //获取当前类中的属性 + 类型
        System.out.println("----------------------------------");
        Field[] declaredFields = studentClass.getDeclaredFields();
        System.out.println("该类中有"+declaredFields.length+"个属性");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getType()+" : "+declaredField.getName());  //获取到当前类中的属性，类型 + 属性名称
        }

        //通过反射执行方法
        System.out.println("----------------------------------");
        Constructor<Student> constructor = studentClass.getConstructor();   //获取到类对象的空参构造器。
        Student student = constructor.newInstance();    //调用构造器创建指定对象。
        Method show = studentClass.getMethod("show", String.class);     //获取的当前类对象中的指定方法。
        show.invoke(student,"Tom");
        System.out.println("-----------------------------------");

        //初始化
        student.setId(12);
        student.setName("李四");
        student.setAddress("郑州");
        Object invoke = studentClass.getMethod("toString").invoke(student);
        System.out.println(invoke);
    }
}
