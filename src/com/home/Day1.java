package com.home;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.home.practice4.methodParam;


/**
 * this is for class main;
 */
public class Day1 {

    /**
     * this is just for learning java;
     *
     * @param args is not used.
     */
    public static void main(String[] args) {

        //practice1.建立Scanner对象, 用户输入方法的练习 （使用了Student的类）
        Scanner userInput = new Scanner(System.in);

        //用户输入的名字
        String name = userInput.next();

        //用户输入的年龄
        int age = userInput.nextInt();

        //用户输入的boolean值对性别
        boolean gender = userInput.nextBoolean();

        //构造器生成
        practice1 pra1 = new practice1(name, age, gender);

        //输出结果
        System.out.println("姓名：" + pra1.getName() + '\n' + "年龄: " + pra1.getAge() + '\n' + "性别: " + pra1.isMale());

        //practice2.输入上个数字比较最大值
        int max;
        int firstNum = userInput.nextInt();
        int secondNum = userInput.nextInt();
        int thirdNum = userInput.nextInt();

        //第一种写法：
        int temp = Math.max(firstNum, secondNum);
        max = Math.max(temp, thirdNum);

        //第二种写法：
        // if (firstNum < secondNum){
        //     max = secondNum;
        // } else {
        //     max = firstNum;
        // }
        // if(max < thirdNum){
        //     max = thirdNum;
        // }
        System.out.println("max is :" + max);

        //practice3.Switch语句结合用户输入的结果选择练习
        int count = 10;
        for (int i = 0; i <= count; i++) {
            switch (count) {
                case 1:
                    System.out.println("Monday");
                    break;
                //这里是case2；
                case 2:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            // 如果还有下一个用户输入， 则打出用户输入时的关键字
            while (userInput.hasNext()) {
                String next = userInput.next();
                System.out.println(next);
                break;
            }

            //practice4.使用匿名对象进行传参
            methodParam(new Scanner(System.in));

            //practice5.对使用method的练习
            //这里创建一个测试———类————Calculation的对象
            practice5 cal = new practice5();
            //尝试打印1+....+100的值
            System.out.println(cal.isOne());
            //调用方法，打印10次——————“次数”
            cal.keT();

            //practice6.Random()的实例, 猜数字小游戏, 遍历集合从大到小.
            Random r = new Random();
            Scanner scan = new Scanner(System.in);
            int countNum = 10;

            //一共是10次猜测。
            for (int h = 0; h < 10; h++) {
                countNum--;
                int RandomNum = r.nextInt(10) + 1;
                System.out.print("请输入您的数字(1-10)： ");
                int num = scan.nextInt();

                //判断用户的猜测结果
                if (num > RandomNum) {
                    System.out.println("输入的数字太大了");
                } else if (RandomNum > num) {
                    System.out.println("输入的数字太小了");
                } else {
                    System.out.println("恭喜你，中奖了");
                    break;
                }
                //打印结果
                System.out.println("随机数字是： " + RandomNum);
                System.out.println("您还剩余： " + countNum + '\n');
            }
            /*=============================================================*/

            //筛选一段随机数字的集合里的偶数
            Random ran = new Random();
            ArrayList<Integer> biggerList = new ArrayList<>();
            ArrayList<Integer> smallList = new ArrayList<>();

            int num;

            //遍历集合， 添加随机数字到大集合里
            for (int k = 0; k < 20; k++) {
                num = ran.nextInt(30) + 1;
                biggerList.add(num);

                //条件判断，筛选大集合里的偶数值放进小集合
                if (num % 2 == 0) {
                    smallList.add(num);
                }
            }
            //打印集合
            System.out.println(smallList.size());
            System.out.println(smallList);

////
        }
    }
}


