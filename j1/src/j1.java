public class j1 {
    public static void main(String[] args) {
/*      Задание
        DONE: Используя IntelliJ IDEA, создайте проект c классом main.
        Создайте две целочисленные переменные и выведите на экран результаты всех арифметических
        операций над этими двумя переменными.
*/
        short a = 2, b = 11;
        double abDiv;
        int abMod;

        abDiv = (a/b);
        abMod = (a%b);

        System.out.println("a+b: "+ (a+b));     // сложение             / addition
        System.out.println("a-b: "+ (a-b));     // вычитание            / subtraction
        System.out.println("a*b: "+ (a*b));     // умножение            / multiplication
        System.out.println("a/b: "+ abDiv);     // деление              / division
        System.out.println(a+b);                // остаток от деления   / modulo

/*      Задание 1
        Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
        Выполните и рассчитайте результат следующих операций для этих переменных:
         x += y - x++ * z;
         z = --x – y * 5;
         y /= x + 5 % z;
         z = x++ + y * 5;
         x = y - x++ * z;

*/


    }
}
