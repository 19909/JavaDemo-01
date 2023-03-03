package com.aphlios.annotationandreflect.reflect;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/3  15:00
 * @PackageName: com.aphlios.annotationandreflect.reflect
 * @ClassName: Student
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
public class Student {

    private int id;
    private String name;
    private String address;
    private String email = "1990945244@qq.com";

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void show(String str){
        System.out.println(str+" : 你好");
    }

    private void count(){
        System.out.println("This is a private method");
    }
}
