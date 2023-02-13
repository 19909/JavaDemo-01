package com.wei.javaSE.example;

import java.util.Scanner;

/**
 * @Author ChenHeWei
 * @Date 2023/2/13 10:48
 * @PackageName:com.wei.javaSE.example
 * @ClassName: NumberGame
 * @Description: TODO
 * @Version 1.0
 *
 *          猜数字游戏
 */
public class NumberGame {

    public void numberGameMather(){
        System.out.println("请输入0-10之间的数字：");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int X = 6;
        if (nextInt == X){
            System.out.println("恭喜你猜中了");
        }else {
            System.out.println("很遗憾，你没有猜中了");
        }
    }

    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        //猜数字游戏
        numberGame.numberGameMather();

    }
}
