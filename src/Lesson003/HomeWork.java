package Lesson003;

public class HomeWork {

    private final static double PI = Math.PI;

    private static void doFirstExercise() {
        System.out.println("Starting first exercise...");
        int x = 10, y = 12, z = 3;
        System.out.println(x += y - x++ * z);
        System.out.println(z = --x - y *5 );
        System.out.println(y /= x + 5 % z);
        System.out.println(z = x++ + y * 5);
        System.out.printf("%1d\nDone.", x = y - x++ * z);
    }

    private static void doSecondExercise() {
        System.out.println("Starting second exercise ...");

        class ArithmeticAverage {
            private int x = 0;
            private int y = 0;
            private int z = 0;

            private ArithmeticAverage(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }

            private double getValue() {
                return ((double)(this.x + this.y + this.z)) / 3;
            }
        }

        ArithmeticAverage average = new ArithmeticAverage(3, 2, 3);

        System.out.printf("Average is %1f\nDone.", average.getValue());
    }

    private static void doThirdExercise(double radius) {
        System.out.println("Starting third exercise ...");
        System.out.printf("Circle area: %1f\nDone.", (Math.pow(radius, 2)) * PI);
    }

    private static void doForthExercise(double radius, double height) {

        class Volume {
            private double radius;
            private double height;

            private Volume(double radius, double height) {
                this.radius = radius;
                this.height = height;
            }

            private double getInnerVolume() {
                return PI * Math.pow(radius, 2) * height;
            }

            private double getSurfaceArea() {
                return 2 * PI * radius * (radius + height);
            }
        }

        Volume volume = new Volume(radius, height);

        System.out.printf("Volume is: %1f\n", volume.getInnerVolume());
        System.out.printf("Surface area is: %1f\nDone.", volume.getSurfaceArea());
    }

    public static void main(String... args) {
        doFirstExercise();
        System.out.println("\n");
        doSecondExercise();
        System.out.println("\n");
        int R = 10;
        doThirdExercise(R);
        System.out.println("\n");
        R = 15;
        int H = 27;
        doForthExercise(R, H);
    }
}
