package com.cn.chw.aphelios.character;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ChenHeWei
 * @Date :  2023/2/21  18:59
 * @PackageName: com.cn.chw.aphelios.character
 * @ClassName: AphliosRegularJob
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      作业
 *      1. 要求实现字符逆序。    -
 *      2. 判断字符出现次数         -
 *      3. 描述一下String、StringBuilder、StringBuffer的区别？        -
 *      4. 将一个数字字符串转换成逗号分隔的数字串，即从右边开始每三个数字用逗号分隔     -
 *      5. 随机生成指定长度的密码或指定长度的验证码字符串。     -
 *      6. 查询身份证号归属地，查询ip所有地
 *      7. 查询手机号归属地
 *      8. 注册项目时，用户的姓名要么是全中文，要么是全英文，不能其它符号，不可以使用混合。     -
 *      9. 姓名是张三丰，显示 张*丰，手机号：13014577033 显示的是 130****7033           -
 *      10. 计算一个字符串所有数字的和       -
 *      11. 在http://www.51beiyou.org/coutus.html 取出邮件地址和手机号。
 */
public class AphliosRegularJob {

    //字符串翻转
    public String overTurn(String bunch){
        StringBuilder stringBuilder = new StringBuilder(bunch);
        return stringBuilder.reverse().toString();
    }

    //判断字符出现的次数
    public int countString(String raw,String target){
        int count = 0;
        if (raw.contains(target)){
            int index = raw.indexOf(target);    //第一个子串索引
            while (index != -1){
                ++count;
                index = raw.indexOf(target,index + target.length());
            }
            return count;
        }
        return count;
    }

    /**
     *  描述一下String、StringBuilder、StringBuffer的区别？
     *
     *      String类不可被继承，初始化后值不能被修改，内部使用了final修饰
     *      StringBuilder类不可被继承，初始化后值可以改变，支持单线程，效率较高
     *      StringBuffer类不可被继承，初始化后值可以改变，支持多线程，效率较低
     */

    //将一个数字字符串转换成逗号分隔的数字串，即从右边开始每三个数字用逗号分隔
    public StringBuilder divideString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (i%3==0 && i != 0){
                stringBuilder.insert(string.length() - i, ",");
            }
        }
        return stringBuilder;
    }

    //随机生成指定长度的密码或指定长度的验证码字符串。
    public String getPassword(int... n) {
        int num = n.length == 0 ? 6 : n[0];
        String str = "0123456789_-=+'\",`~!@#$%^&* ()abcdefghijklmnolpqrstuvwxyzABCDEFGHIJKLMNOLPQRSTUVWXYZ";
        StringBuilder sbu = new StringBuilder(6);
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            sbu.append(str.charAt(rand.nextInt(str.length())));
        }
        return sbu.toString();
    }
    public String getSecurityCode(int ... ints){
        int num = ints.length == 0 ? 4 : ints[0];
        String str = "abcdefghijklmnolpqrstuvwxyzABCDEFGHIJKLMNOLPQRSTUVWXYZ";
        StringBuilder sbu = new StringBuilder(4);
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            sbu.append(str.charAt(rand.nextInt(str.length())));
        }
        return sbu.toString();
    }

    //注册项目时，用户的姓名要么是全中文，要么是全英文，不能其它符号，不可以使用混合。
    //返回ture 表明通过  false 表明不通过
    public Boolean nameConfine(String userName){
        Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]+|[a-zA-Z]+");
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }

    //姓名是张三丰，显示 张*丰，手机号：13014577033 显示的是 130****7033
    public String showNamePhone(String name,String phone){
        String nameReplace = name.replaceAll("([\\u4e00-\\u9fa5]).*([\\u4e00-\\u9fa5])", "$1*$2");
        String phoneReplace = phone.replaceAll("([1-9][0-9]{2})\\d{4}(\\d{4})", "$1****$2");
        StringBuilder stringBuilder = new StringBuilder(nameReplace);
        stringBuilder.append("   "+phoneReplace);
        return stringBuilder.toString();
    }

    //计算一个字符串所有数字的和
    public int sum(String string){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        int sum = 0;
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }


    public static void main(String[] args) {

        AphliosRegularJob job = new AphliosRegularJob();
//        System.out.println(job.overTurn("Hello"));
//        System.out.println(job.countString("Hello World", "l"));
//        System.out.println(job.divideString("ahdajkbfvolbdvlxhkbflia"));
//        System.out.println(job.getPassword(9));
//        System.out.println(job.getSecurityCode());
//        System.out.println(job.nameConfine("张三丰"));
//        System.out.println(job.showNamePhone("张三四丰", "13014577033"));
//        System.out.println(job.sum("a1b2c3d4e5f6d12d23+100"));
    }

}
