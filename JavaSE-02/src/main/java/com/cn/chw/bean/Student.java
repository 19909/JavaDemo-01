package com.cn.chw.bean;

import java.util.Date;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 14:52
 * @PackageName:com.cn.chw.bean
 * @ClassName: Student
 * @Description: TODO
 * @Version 1.0
 *
 *          链式编程结构
 */
public class Student {
    private Integer id;
    private String name;
    private Date date;

    public Student() {
    }

    public Student(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    //享受链式编程
    public Student setId(Integer id) {
        this.id = id;
        return this;
    }
    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public Student setDate(Date date) {
        this.date = date;
        return this;
    }

    //get方法
    public Integer getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public Date getDate(){
        return date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        //链式编程
        Student tom = student.setId(1).setName("Tom").setDate(new Date());
        System.out.println("享受链式编程的效果");
    }
}

