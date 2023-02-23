package com.cn.chw.aphelios.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/23  10:58
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: Student
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>{
    private Integer id;
    private String userName;
    private int score;

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(id, student.id) && Objects.equals(userName, student.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, score);
    }*/

    @Override
    public int compareTo(Student o) {
        //根据分数排序    （默认）
        return this.score - o.score;
    }
}
