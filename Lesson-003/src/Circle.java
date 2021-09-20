public class Circle {
    public static void main(String[] args) {
        /* Задание 3
        DONE: Используя IntelliJ IDEA, создайте класс Circle.
        DONE: Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r.
        DONE: Используя формулу πR2, вычислите площадь круга и выведите результат на экран
         */
        final double PI = 3.1415;
        double r = 2.5, S;

//        S = Math.pow(PI*r,2);
        S = PI*(Math.pow(r,2));
        System.out.println("Площадь круга с радиусом " + r + "м. = "+ S +" метров");
    }
}
