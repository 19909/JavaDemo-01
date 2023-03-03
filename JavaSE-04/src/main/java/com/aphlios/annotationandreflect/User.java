package com.aphlios.annotationandreflect;

import java.lang.annotation.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  11:11
 * @PackageName: com.aphlios.annotationandreflect
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      注解的定义
 *
 *  内置注解
 *      @Override               - 检查该方法是否是重写方法。如果发现其父类，或者是引用的接口中并没有该方法时，会报编译错误。
 *      @Deprecated             - 标记过时方法。如果使用该方法，会报编译警告。
 *      @SuppressWarnings       - 指示编译器去忽略注解中声明的警告。
 *      @FunctionalInterface    - Java 8 开始支持，标识一个匿名函数或函数式接口。
 *
 *  自定义注解
 *      元注解，本质上是注解的注解。
 *
 *      @Documented 该注解是一个标注注解， 主要是为了进行 javadoc 生成代码的时候， 显示注解内容。
 *      @Retention 注解接口 可以理解该接口的生命周期， 也就是在运行时保留该注解多少时间。
 *      也就是说对于 Retention 注解的接口参数就三个，分别是： RetentionPolicy.CLASS，RetentionPolicy.RUNTIME 以及 RetentionPolicy.SOURCE。
 *      如果注解接口不包含该注解，则默认的策略是：RetentionPolicy.CLASS
 *
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface User {

    int id();

    String username() default "";

}
