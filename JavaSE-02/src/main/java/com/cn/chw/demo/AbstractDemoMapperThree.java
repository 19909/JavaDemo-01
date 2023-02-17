package com.cn.chw.demo;

import java.text.SimpleDateFormat;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 10:53
 * @PackageName:com.cn.chw.demo
 * @ClassName: AbstractDemoMapperThree
 * @Description: TODO
 * @Version 1.0
 */
public class AbstractDemoMapperThree extends AbstractDemo{

    public String save(){
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(currentTimeMillis);
        return format;
    }
}
