public class Main {
    public static void main(String[] args) {
        /* Задание 5
        Используя IntelliJ IDEA, создайте класс Main.
        Проверьте, можно ли создать переменные со следующими именами:
        uberflu? , _Identifier , \u006fIdentifier , &myVar , myVariab1le
         */

//        int  uberflu? = '1';                 // ERROR: 'java: ';' expected'
//        System.out.println(uberflu?);

        int  Identifier = '2';               // ERROR: выводится '50' - не знаю что это
        System.out.println(Identifier);

        int  \u006fIdentifier = '3';         // ERROR: выводится '51' - не знаю что это
        System.out.println(\u006fIdentifier);

//        int  &myVar = = '4';                 // ERROR: 'java: not a statement'
//        System.out.println(&myVar);

        char myVariab1le = '5';
        System.out.println(myVariab1le);

    }
}
