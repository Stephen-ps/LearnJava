package com.home.Day2;

public class Day2 {

    /**
     * @param args is not used
     */
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str2);//false
    }
}
