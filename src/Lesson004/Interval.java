package Lesson004;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter some number from 0 to 100:");
        double num;
        if (in.hasNextDouble()) {
            num = in.nextDouble();
            if (num > -1) {
                String limit;
                while(true) {
                    if (num < 15) {
                        limit = "[0 - 14]";
                        break;
                    }
                    if (num < 36) {
                        limit = "[15 - 35]";
                        break;
                    }
                    if (num < 51) {
                        limit = "[36 - 50]";
                        break;
                    }
                    if (num < 101) {
                        limit = "[51 - 100]";
                        break;
                    }
                    System.out.println("Value is more then 100!");
                    return;
                }
                System.out.printf("Value is in %1s range", limit);
            }
            System.out.println("Value is less then 0!");
        }
        System.out.println("Expected to get number as input value!");
    }
}
