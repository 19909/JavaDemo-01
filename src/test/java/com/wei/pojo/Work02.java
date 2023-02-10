package com.wei.pojo;

import org.junit.Test;

import java.util.Random;

/**
 * @Author ChenHeWei
 * @Date 2023/2/10 14:57
 * @PackageName:com.wei.pojo
 * @ClassName: Work02
 * @Description: TODO
 * @Version 1.0
 */
public class Work02 {

    @Test
    public void text01(){
        //生成Random实例
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
//        int anInt = random.nextInt(3);
//        System.out.println(anInt);

        }
    }

    @Test
    public void text02(){
        Random random = new Random();
        final int win = 7;    //中奖号码
        int myWinH = random.nextInt(100) + 1;
        //中奖率 1%
        if (win == myWinH){
                        System.out.println("你的号码 ：" + myWinH + " 在本次活动中中奖了");
        }else {
                        System.out.println("你的号码 ：" + myWinH + " 在本次活动中没有中奖了");
        }
    }


}
