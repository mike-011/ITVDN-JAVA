package Lesson005;

public class Parity {

    private static boolean isEvenViaBits(int x) {
        return (x & 1) == 0;
    }

    private static boolean isEvenViaDiv(int x) {
        return (x % 2) == 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.printf(
                    "Number '%s' is even via bit check '%b'; via div check '%b'\n",
                    i, isEvenViaBits(i), isEvenViaDiv(i)
            );
        }
    }
}
