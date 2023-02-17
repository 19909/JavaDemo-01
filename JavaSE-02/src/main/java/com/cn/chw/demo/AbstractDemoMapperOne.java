package com.cn.chw.demo;

import java.text.SimpleDateFormat;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 10:52
 * @PackageName:com.cn.chw.demo
 * @ClassName: AbstractDemoMapperOne
 * @Description: TODO
 * @Version 1.0
 */
public class AbstractDemoMapperOne extends AbstractDemo{

    public String save(){
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(currentTimeMillis);
    }
}
