package Lesson005;

public class LogicOperation {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        System.out.println(x += y >> x++ * z);
        System.out.println(z = ++x & y * 5);
        System.out.println(y /= x + 5 | z);
        System.out.println(z = x++ & y * 5);
        System.out.println(x = y << x++ ^ z);
    }
}
