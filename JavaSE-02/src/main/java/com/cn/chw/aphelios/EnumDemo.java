package com.cn.chw.aphelios;

/**
 * @Author ChenHeWei
 * @Date 2023/2/18 9:16
 * @PackageName:com.cn.chw.aphelios
 * @ClassName: EnumDemo
 * @Description: TODO
 * @Version 1.0
 */
public enum EnumDemo {

    SUCCESS(200,"成功"),
    ERROR(500,"错误");
    private int code;
    private String message;

    private EnumDemo(int code , String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
