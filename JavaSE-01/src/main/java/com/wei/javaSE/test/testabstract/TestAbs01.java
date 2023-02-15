package com.wei.javaSE.test.testabstract;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 9:14
 * @PackageName:com.wei.javaSE.test
 * @ClassName: TestAbs01
 * @Description: TODO
 * @Version 1.0
 *
 *      普通类继承抽象类需要实现父类中的抽象方法，
 */
public class TestAbs01 extends Abs01 {

    @Override
    public int getPage(int a) {
        return a;
    }

    @Override
    public String getName() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setId(12);
        book.setName("张三");
        System.out.println(book.toString());

    }
}
