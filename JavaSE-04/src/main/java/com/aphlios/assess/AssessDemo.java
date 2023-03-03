package com.aphlios.assess;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @Author ChenHeWei
 * @Date :  2023/3/2  14:28
 * @PackageName: com.aphlios.assess
 * @ClassName: AssessDemo
 * @Description: TODO
 * @Version 1.0
 * @Since 1.8
 *
 *      第四周考核编程题。
 */
public class AssessDemo {

    public static void ScannerString(){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();

        Pattern compile = Pattern.compile("[\\u4e00-\\u9fa5]+");

        boolean matches = compile.matcher(next).matches();
        if (matches){
            System.out.println("字符串是中文");

        }else if (Pattern.matches("[a-zA-Z]+",next)) {
            System.out.println("字符串是英文");
        }else if (Pattern.matches("\\d+",next)) {
            System.out.println("字符串是数字");
        } else {
            System.out.println("字符串是其他字符");
        }
    }

    public static void countList(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0,i);
        }
        long e = System.currentTimeMillis();
        System.out.println("ArrayList插入所用时间"+ (e-l));

        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0,i);
        }
        long e1 = System.currentTimeMillis();
        System.out.println("LinkedList插入所用时间" + (e1 - l1));

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            linkedList.remove(next);
        }

    }

    public static void numberGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个0-9之间的数");
        Random random = new Random();
        int i = random.nextInt(10);
        while (true){

            try {
                int nextInt = scanner.nextInt();
                if (i == nextInt){
                    System.out.println("猜对了");
                    break;
                } else {
                    System.out.println("请重新输入0-9之间的数字");
                    scanner.next();
                }
            } catch (Exception e){
                throw new RuntimeException("输入的数字异常！程序终止！");
            }

        }
    }

    public static void main(String[] args) {
//        ScannerString();
//        countList();
//    numberGame();
    }
}
