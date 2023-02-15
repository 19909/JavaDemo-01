package com.wei.javaSE.test.testabstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ChenHeWei
 * @Date 2023/2/15 9:33
 * @PackageName:com.wei.javaSE.test
 * @ClassName: Book
 * @Description: TODO
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;
    private String name;
}
