package Lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_3 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
//   1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать
//   это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
//   чем   загаданное,или меньше. После победы или проигрыша выводится запрос –
//   «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        playGuessNumber();

//   2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
//   "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
//   "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//   При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//   сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
//   компьютер показывает буквы которые стоят на своих местах.
//   apple – загаданное
//   apricot - ответ игрока
//   ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//   Для сравнения двух слов посимвольно, можно пользоваться:
//   String str = "apple";
//   str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//   Играем до тех пор, пока игрок не отгадает слово
//   Используем только маленькие буквы
        playGuessWord();
    }

    public static void playGuessNumber() {
        guessNumber();
    }

    private static void guessNumber() {
        int x = random.nextInt(10);
        System.out.println("Загадано число от 0 до 9. У вас есть три попытки, чтобы угадать это число.");
        int go = 0;
        while (go < 3) {
            int num = scanner.nextInt();
            if (num < x) {
                System.out.println("Ваше число меньше загаданного");
            } else if (num > x) {
                System.out.println("Ваше число больше загаданного");
            } else {
                System.out.println("Невероятное везение! Вы угадали!");
                continuation();
                break;
            }
            go++;
        }
        continuation();
    }

    private static void continuation() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int a = scanner.nextInt();
        if (a == 1) {
            guessNumber();
        } else {
            System.out.println("Досвидания!");
        }
    }


    public static void playGuessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words) + "\nУгадайте, какое слово я загадала?!");
        int prog = random.nextInt(words.length);
        char[] chprog = words[prog].toCharArray();
        char[] chprog2 = new char[15];
        for (int i = 0; i < chprog2.length; i++) {
            chprog2[i] = '*';
        }
        while (true) {
            String user = scanner.next();
            if (user.equalsIgnoreCase(words[prog])) {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            } else {
                char[] chuser = user.toCharArray();
                if (chprog.length >= chuser.length) {
                    for (int i = 0; i < chuser.length; i++) {
                        if (chprog[i] == chuser[i]) {
                            chprog2[i] = chprog[i];
                        }
                    }
                } else {
                    for (int i = 0; i < chprog.length; i++) {
                        if (chprog[i] == chuser[i]) {
                            chprog2[i] = chprog[i];
                        }
                    }
                }
                System.out.println("Подскажу!\n" + String.valueOf(chprog2));
            }
        }
    }

}

















