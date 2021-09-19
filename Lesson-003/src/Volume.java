import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        /* Задание 4
        DONE: Используя IntelliJ IDEA, создайте класс Volume.
        DONE: Напишите программу расчета объема - V и площади поверхности -S цилиндра.
        Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
        Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
        DONE: Результаты расчетов выведите на экран.
         */
        final double PI = 3.1415;
        double V,S;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус цилиндра 'R' (дробное число, разделитель - запятая): ");
        double R = input.nextDouble();   //считываем дробное число

        System.out.println("Введите высоту цилиндра 'h' (дробное число, разделитель - запятая): ");
        double h = input.nextDouble();   //считываем дробное число

        V = PI * Math.pow(R,2) * h;
        S = 2 * ( PI * R * ( R + h ));
        System.out.println("Объем V цилиндра радиусом – R и высотой – h ровняется: "+ V);
        System.out.println("Площадь S цилиндра радиусом – R и высотой – h ровняется: "+ S);



    }
}
