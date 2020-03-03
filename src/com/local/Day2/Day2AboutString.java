package com.local.Day2;

import java.lang.reflect.Array;
import java.util.Scanner;


//主要是关于字符串的学习
public class Day2AboutString {

    /**
     * @param args is not used
     */
    public static void main(String[] args) {
        //对于引用类型来说， “==”进行的是地址的比较，一个新的对象地址会发生改变。
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'A', 'B', 'C'};
        String str3 = new String(charArray);

        //测试结果，“==”这只是对地址值的比较。
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str2);//false
        /*=========================================================================*/
        //public boolean equals(Object obj), 这个方法可以只比较内容。
        //推荐把常量发在前面：常量.equals.(xxx)
        String str4 = "abc";
        String str5 = "abc";
        char[] charArray2 = {'A', 'B', 'B'};
        String str6 = new String(charArray2);

        System.out.println("=====================================");

        //打印结果
        System.out.println(str4.equals(str5));//true
        System.out.println(str4.equals(str6));//false
        System.out.println(str5.equals(str6));//false

        //equalsIgnoreCase()不区分大小写。
        String a = "Java";
        String b = "java";

        System.out.println("=====================================");
        //打印结果
        System.out.println(a.equals(b));//false
        System.out.println(a.equalsIgnoreCase(b));//true

        System.out.println("=====================================");

        //查找字符串第一次出现的位置
        String str = "Hello world";
        int findIndex = str.indexOf("H");
        System.out.println("第一次出现的索引值：index：" + findIndex);

        //使用substring的练习
        String s = "HelloWord";
        //从第五号元素开始截取
        String s1 = s.substring(5);
        //从第四号元素开始截取一直到第7号元素；
        String s2 = s.substring(4, 7);

        System.out.println("=====================================");
        //打印结果
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("=====================================");

        //词条过滤
       /* Scanner scan = new Scanner(System.in);
        String guoLu = scan.next();

        //设置输入的替换词条
        guoLu = guoLu.replace("草泥马", "***");
        guoLu = guoLu.replace("傻逼", "***");
        guoLu = guoLu.replace("操你妈", "***");
        guoLu = guoLu.replace("你爷爷的", "***");
        guoLu = guoLu.replace("操你", "***");
        System.out.println(guoLu);
        System.out.println("=====================================");*/

        //字符串切割
        String st = "aaa,bbb,ccc";
        String[] arrayQieGe = st.split(",");
        for (String item: arrayQieGe) {
            System.out.println(item);
        }
        System.out.println("=====================================");

        ////注意事项，split（）不能直接对"."进行分割， 要在前面加"\\"
        String st1 = "aaa.bbb.ccc";
        String[] arrayQieGe1 = st1.split(".");
        System.out.println("数组的长度为：" + arrayQieGe1.length);//0

        System.out.println("=====================================");
        //注意事项，split（）不能直接对"."进行分割， 要在前面加"\\"
        String st2 = "aaa.bbb.ccc";
        String[] arrayQieGe2 = st2.split("\\.");
        System.out.println("数组的长度为：" + arrayQieGe2.length);//3
        for (String value: arrayQieGe2) {
            System.out.println(value);
        }


    }
}
