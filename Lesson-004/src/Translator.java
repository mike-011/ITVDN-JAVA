import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        /* Задание 1
        DONE: Используя IntelliJ IDEA, создайте класс Translator.
        DONE: Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде.
        Требуется, чтобы пользователь вводил слово на русском языке, а программа давала ему
        перевод этого слова на английском языке. Если пользователь ввел слово, для которого
        отсутствует перевод, то следует вывести сообщение, что такого слова нет.
        */
        System.out.println("Привет, я переводчик десяти слов о погоде, знаю вот эти слова: \n тепло холодно жарко снежно дождливо солнечно облачно туман ураган цунами");
//        System.out.println(" warmly coldly hot snowly rainy sunny cloudy smoke storm tsunami");
        System.out.println("Введите любое из этих слов, на русском: ");

        Scanner in = new Scanner(System.in);
        String weatherWord = in.next();
        weatherWord = weatherWord.toLowerCase();

        switch (weatherWord) {
//       1  тепло    warmly
            case"тепло":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: warmly");
                break;
//       2  холодно  coldly
            case"холодно":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: coldly");
                break;
//       3  жарко    hot
            case"жарко":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: hot");
                break;
//       4  снежно  snowly
            case"снежно":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: snowly");
                break;
//       5  дождливо  rainy
            case"дождливо":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: rainy");
                break;
//       6  солнечно sunny
            case"солнечно":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: sunny");
                break;
//       7  облачно  cloudy
            case"облачно":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: cloudy");
                break;
//       8  туман    smoke
            case"туман":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: smoke");
                break;
//       9  ураган   storm
            case"ураган":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: storm");
                break;
//       10 цунами   tsunami
            case"цунами":
                System.out.println("\nПо русски : " + weatherWord + "\nIn English: tsunami");
                break;

            default:
                System.out.println("Извините, я таких слов не знаю!");
                break;
        }
    }
}
