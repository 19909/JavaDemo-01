package com.cn.chw.aphelios.character;

/**
 * @Author ChenHeWei
 * @Date 2023/2/20 19:06
 * @PackageName:com.cn.chw.aphelios.character
 * @ClassName: AphliosStringDemo
 * @Description: TODO
 * @Version 1.0
 */
public class AphliosStringDemo {

    public static void main(String[] args) {
        String file = "c:/user/abc/upload/xxsfasf.afasf-asfas.jpg";
        ////求出文件目录 c:/user/abc/upload/
        String substring = file.substring(0,file.lastIndexOf("/"));
        System.out.println(substring);  //c:/user/abc/upload

        ////求出文件名称 xxsfasf.afasf-asfas.jpg
        String s = file.substring(file.lastIndexOf("/")+1);
        System.out.println(s);  //xxsfasf.afasf-asfas.jpg

        ////求出文件的扩展名 jpg
        String s1 = file.substring(file.lastIndexOf(".")+1);
        System.out.println(s1);//jpg

        ////将字符串替换为c:/user/abc/upload/20211202154333.jpg
        String s2 = file.substring(file.lastIndexOf("/")+1, file.lastIndexOf("."));
        System.out.println(s2);
        String replace = file.replace(s2, "20211202154333");
        System.out.println(replace);
    }
}
