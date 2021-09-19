public class ArithmeticAverage {
    public static void main(String[] args) {
        /* Задание 2
        DONE: Используя IntelliJ IDEA, создайте класс ArithmeticAverage .
        DONE: Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
        С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного
        отображения результата?
         */

        int x = 10, y = 12, z = 3;
        double avg;

        avg = (x+y+z)/3.0d;
        System.out.println("Avarage is : "+ avg);
        // проблема "java: incompatible types: possible lossy conversion from double to int"
        // надо привести все переменные к FLOAT или DOUBLE
    }
}
