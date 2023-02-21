package com.cn.chw.aphelios.character;

import java.io.File;
import java.util.UUID;

/**
 * @Author ChenHeWei
 * @Date 2023/2/21 8:53
 * @PackageName:com.cn.chw.aphelios.character
 * @ClassName: AphliosStringFileSeparator
 * @Description: TODO
 * @Version 1.0
 *
 */
public class AphliosStringFileSeparator {

    public static void main(String[] args) {
        String p = "d:/xxx/user/user_abc.jpg";
        System.out.println(p);  //d:/xxx/user/user_abc.jpg
        //File.separator 是根据系统返回相关的符号 linux / windows \ \\
        String fc = File.separator;

        fc = p.indexOf(fc) == -1 ? "/" : fc;
        System.out.println(fc); //  /

        String path = p.substring(0, p.lastIndexOf(fc)).concat(fc);
        System.out.println(path);   //  d:/xxx/user/

        String name = p.substring(p.lastIndexOf(fc) + 1);
        System.out.println(name);   //  user_abc.jpg

        String ext = name.lastIndexOf(".") == -1 ? "" : name.substring(name.lastIndexOf(".") + 1);
        System.out.println(ext);    //  jpg

        UUID uuid = UUID.randomUUID();
        String newp = String.format("%s%s.%s", path, uuid, ext);
        System.out.println(newp);   //  d:/xxx/user/6c397ff9-cef2-4d52-af9f-3ead48bf55ae.jpg


    }
}
