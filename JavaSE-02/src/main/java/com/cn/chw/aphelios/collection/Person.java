package com.cn.chw.aphelios.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/23  13:52
 * @PackageName: com.cn.chw.aphelios.collection
 * @ClassName: Person
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person>{
    private Integer id;
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
