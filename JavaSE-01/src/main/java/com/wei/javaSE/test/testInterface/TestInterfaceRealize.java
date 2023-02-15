package com.wei.javaSE.test.testInterface;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 10:39
 * @PackageName:com.wei.javaSE.test
 * @ClassName: TestInterfaceRealize
 * @Description: TODO
 * @Version 1.0
 *
 *          接口实现的基本使用
 */

public class TestInterfaceRealize implements TestInterface{

    @Override
    public int method2(int a, int b) {
        return TestInterface.super.method2(a, b);
    }

    @Override
    public int method3(int a , int b) {
        return a*b;
    }

    public static void main(String[] args) {
        TestInterfaceRealize testInterfaceRealize = new TestInterfaceRealize();
        int i = TestInterface.method1(1);
        int method2 = testInterfaceRealize.method2(1, 2);
        int method3 = testInterfaceRealize.method3(2, 3);

        System.out.println(i);
        System.out.println(method2);
        System.out.println(method3);
    }
}
