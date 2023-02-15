package com.wei.javaSE.test.testInterface;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 10:36
 * @PackageName:com.wei.javaSE.test
 * @ClassName: TestInterface
 * @Description: TODO
 * @Version 1.0
 *
 *      接口的默认实现、和简单的实现、接口的定义
 */
public interface TestInterface {

    //使用static修饰的方法不能被子类实现和继承
    static int method1(int a){
        return a * 2;
    };

    default int method2(int a,int b){
      return a + b;
    };

    //抽象方法
    public int method3(int a , int b);
}
