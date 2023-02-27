package com.chen.aphlios.iobufferedentity.entity;

import java.io.Serializable;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/27  10:07
 * @PackageName: com.chen.aphlios.iobufferedentity.entity
 * @ClassName: Book
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */

public class Book implements Serializable {

    //设置 序列化 当前对象的版本号
    private static final long serialVersionUID = -4947422624007128653L;

    private int id;
    private String name;
    private String address;

    public Book() {
    }

    public Book(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
