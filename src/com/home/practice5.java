package com.home;

public class practice5 {

    /**
     * @param a is one of the number for calculation
     * @param b is one of the number for calculation
     * @return the result to the method
     */
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    /**
     * this is for loop
     */
    protected void keT() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("次数");
            if (i == 10) {
                System.out.println("结束");
                break;
            }
        }
    }

    protected static boolean isSame(int x, int y) {
        return x == y;
    }

    protected int isOne() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }
}
