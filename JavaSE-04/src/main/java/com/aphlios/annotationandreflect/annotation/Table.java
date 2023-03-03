package com.aphlios.annotationandreflect.annotation;

import java.lang.annotation.*;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  17:05
 * @PackageName: com.aphlios.annotationandreflect.annotation
 * @ClassName: Table
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    int id();

    String name() default "";

}
