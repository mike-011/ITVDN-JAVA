package Lesson005;

public class PowerOfTwo {

    private static int getSumOfBits(int x) {
        int sum = 0;
        for (int i = 0; i <= Integer.SIZE; i++) {
            sum += (x >> i) & 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int one = 1;
        for (int i = 0; i < 11; i++) {
            System.out.printf("Number '%d' is%s a power of two.\n", i, (getSumOfBits(i) == one) ? "" : " not");
        }
    }
}
