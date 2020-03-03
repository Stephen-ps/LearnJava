package com.local.Day2;

public class Day2 {

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
        //结果
        System.out.println("=====================================");
        System.out.println(str4.equals(str5));//true
        System.out.println(str4.equals(str6));//false
        System.out.println(str5.equals(str6));//false

        //equalsIgnoreCase()不区分大小写。
        String a = "Java";
        String b = "java";
        System.out.println("=====================================");
        System.out.println(a.equals(b));//false
        System.out.println(a.equalsIgnoreCase(b));//true

    }
}
