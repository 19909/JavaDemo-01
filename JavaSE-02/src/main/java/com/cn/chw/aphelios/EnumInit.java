package com.cn.chw.aphelios;

/**
 * @Author ChenHeWei
 * @Date 2023/2/18 9:21
 * @PackageName:com.cn.chw.aphelios
 * @ClassName: EnumInit
 * @Description: TODO
 * @Version 1.0
 */
public enum EnumInit {

    RED,BLUE,BACK,BREAK;
    EnumInit(){
        System.out.println("调用了无参构造");
    }
}
