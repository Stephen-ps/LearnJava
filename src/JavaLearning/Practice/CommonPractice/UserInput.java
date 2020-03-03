package JavaLearning.Practice.CommonPractice;

import java.util.Scanner;

public class UserInput {
    public static void methodParam(Scanner sc) {
        Scanner sca = new Scanner(System.in);
        int input = sca.nextInt();
        System.out.println("this is your input: " + input);
    }
}
