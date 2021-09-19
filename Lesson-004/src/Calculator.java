import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*Задание 2
        DONE: Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу – консольный калькулятор.
                1. + Создайте две переменные с именами operand1 и operand2.
                2. + Задайте переменным некоторые произвольные значения.
                3. + Предложите пользователю ввести знак арифметической операции.
                4. + Примите значение, введенное пользователем и поместите его в строковую переменную sign.
                5. Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
                6. Выведите на экран результат выполнения арифметической операции.
                7. В случае использования операции деления, организуйте проверку попытки деления на ноль.
                И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
        */
        int operand1 = 10, operand2 = 33, result;
        double division;

        System.out.println("Вы запустили калькулятор, он выполняет операции над числами " + operand1 + " и " + operand2);
        System.out.println("Введите знак арифметической операции (+; -; *; /; %; **;): ");

        Scanner in = new Scanner(System.in);
        String sign = in.next();

        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Сумма чисел: " + operand1 + " и " + operand2+ " равна " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Разница чисел: " + operand1 + " и " +  operand2+ " равна " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Результат умножения: " + operand1 + " на " + operand2+ " равен " + result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("ВНИМАНИЕ: Деление на ноль! Программа завершена.");
                    break;
                }
                division = (double) operand1 / (double) operand2;
                System.out.println("Результат деления: " + operand1 + " на " + operand2+ " равен " + division);
                break;

            case "%":
                result = operand1 % operand2;
                System.out.println("Остаток от деления: " + operand1 + " и " + operand2+ " составляет " + result);
                break;
            case "**":
                result = (int)Math.pow(operand1,operand2);
                System.out.println(operand1 + " в степени " + operand2 + " составляет " + result);
                break;

            default:
                System.out.println("Извините, операцию не возможно выполнить!");
                break;
        }
    }
}
