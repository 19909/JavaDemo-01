package com.cn.chw.demo;

/**
 * @Author ChenHeWei
 * @Date 2023/2/16 11:15
 * @PackageName:com.cn.chw.demo
 * @ClassName: EnumDemo
 * @Description: TODO
 * @Version 1.0
 */
public class EnumDemo {
    enum en {a,b,c}
    enum color {RED,GREEN,BLUE}
    enum num {
        //定义枚举常量
        SUCCESS(200, "成功"), FAIL(400, "失败"),
        NOTFOUND(404, "未知"), ERROR(300, "错误");

        public int code;
        public String message;

        num(int code,String message){
            this.code = code;
            this.message = message;
        }

        @Override
        public String toString() {
            return "num{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

    }
}
