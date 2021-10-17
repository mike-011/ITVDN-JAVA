package Lesson005;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        int MIN_RATE= 10;
        int MAX_RATE = 50;

        System.out.println("Please, enter record of work for employee in years (positive integer):");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int years = scanner.nextInt();
            if (years <= 0) {
                System.out.printf("Invalid input '%d', positive integer value expected.", years);
                return;
            }

            int rate = ((years / 5) * 2 + 1) * 5;
            rate = rate < MIN_RATE ? MIN_RATE : rate > MAX_RATE ? MAX_RATE : rate;

            System.out.printf("Premium rate for %d years of employment is %d%% ", years, rate);
        } else {
            System.out.printf("Positive integer value expected as input, got: %s", scanner.next());
        }
    }
}
