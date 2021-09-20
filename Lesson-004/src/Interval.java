import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        /* Задание 3
        DONE: Используя IntelliJ IDEA, создайте класс Interval.
        DONE: Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100].
        DONE: Если да, то укажите, в какой именно промежуток.
        DONE: Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение. */

        System.out.println("Введите число от '0' до '100', если число дробное - используйте запятую: ");

        Scanner in = new Scanner(System.in);
        float choice = in.nextFloat();  // как организовать проверку, число это или нет, я пока не знаю :/
        String range = "unkknown";

        if (choice >=0 && choice <=100) {
            if (choice >= 0 && choice <= 14) {
                range = "0.14";
//                System.out.println("Вы ввели число из диапазона [0 - 14]: " + choice);
            }

            if (choice >= 15 && choice <= 35) {
                range = "15.35";
//                System.out.println("Вы ввели число из диапазона [15 - 35]: " + choice);
            }

            if (choice >= 36 && choice <= 50) {
                range = "36.50";
//                System.out.println("Вы ввели число из диапазона [36 - 50]: " + choice);
            }

            if (choice >= 50 && choice <= 100) {
                range = "50.100";
//                System.out.println("Вы ввели число из диапазона [50 - 100]: " + choice);
            }
            switch (range) {
                case "0.14":
                    System.out.println("Вы ввели число из диапазона [0 - 14]: " + choice);
                    break;
                case "15.35":
                    System.out.println("Вы ввели число из диапазона [15 - 35]: " + choice);
                    break;
                case "36.50":
                    System.out.println("Вы ввели число из диапазона [36 - 50]: " + choice);
                    break;
                case "50.100":
                    System.out.println("Вы ввели число из диапазона [50 - 100]: " + choice);
                    break;

                default:
                    System.out.println("Вы ввели число: "+ choice + " - это число вне диапазона программы! \nЛибо оно отрицательное, либо оно в диапазонах [14 - 15],[35 - 36]");
                    break;
            }



        } else {
            range = String.valueOf(choice);
//            System.out.println(range);
            System.out.println("Извините, операцию не возможно выполнить!\nВы ввели число: "+ choice + ", а надо вводить числа от '0' до '100'");

        }


    }
}
