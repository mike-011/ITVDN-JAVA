package Lesson004;

import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        final String PLUS = "+";
        final String MIN = "-";
        final String DIV = "/";
        final String MULT = "*";

        System.out.printf("Please, enter one of the following math: '%s', '%s', '%s', '%s'\n", PLUS, MIN, DIV, MULT);
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();

        double operand1 = Math.random() * 100;
        double operand2 = Math.random() * 10;
        double result;

        switch (sign) {
            case PLUS:
                result = operand1 + operand2;
                break;
            case MIN:
                result = operand1 - operand2;
                break;
            case DIV:
                if (operand2 == 0) {
                    System.out.println("Division by zero! Skipping operation.");
                    return;
                }
                result = operand1 / operand2;
                break;
            case MULT:
                result = operand1 * operand2;
                break;
            default:
                System.out.printf("Unknown math operand '%1s'!", sign);
                return;
        }

        System.out.printf("Result of operation '%f %s %f' is '%f'", operand1, sign, operand2, result);
    }
}
