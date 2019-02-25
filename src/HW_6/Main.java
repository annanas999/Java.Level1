package HW_6;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Поздравляю! Вы завели питомцев!\nПознакомьтесь с ними!");

        Cat cat = new Cat("Пират", "кот перс", "кровожадный и алчный");
        Dog dog1 = new Dog("Боря", "собака корги", "дружелюбная и беспечная");
        Dog dog2 = new Dog("Петя", "собака булли", "ласковая и верная");

        cat.animalInfo();
        dog1.animalInfo();
        dog2.animalInfo();

        do {
            System.out.println("Хотите потренировать ваших питомцев?\nЗадайте дистанцию в метрах для пробежки: ");
            while (true) {

                int distance_run = scanner.nextInt();
                if (distance_run < 1200) {
                    cat.runCat(distance_run);
                    dog1.runDog(distance_run);
                    dog2.runDog(distance_run);
                    break;
                } else {
                    checkDistanceRun(distance_run);
                }
            }

            System.out.println("Питомцы разыгрались!\nЗадайте высоту в метрах для прыжков: ");
            while (true) {
                int height_jump = scanner.nextInt();
                if (height_jump < 4) {
                    cat.jumpCat(height_jump);
                    dog1.jumpDog(height_jump);
                    dog2.jumpDog(height_jump);
                    break;
                } else {
                    checkHeightJump(height_jump);
                }
            }

            System.out.println("А теперь поплаваем!\nЗадайте дистанцию в метрах для заплыва: ");
            while (true) {

                int distance_swim = scanner.nextInt();
                if (distance_swim < 20) {
                    cat.swimCat(distance_swim);
                    dog1.swimDog(distance_swim);
                    dog2.swimDog(distance_swim);
                    break;
                } else {
                    checkDistanceSwim(distance_swim);
                }

            }

        } while (continuation());

    }


    static void checkDistanceRun(int distance) {

        if (distance > 1200) {
            System.out.println("Это слишком большая дистанция для ваших питомцев, попробуйте еще раз: ");
        } else if (distance <= 0) {
            System.out.println("Это слишком маленькая дистанция для ваших питомцев, попробуйте еще раз: ");
        }
    }

    static void checkHeightJump(int height) {

        if (height > 4) {
            System.out.println("Это слишком много для ваших питомцев, попробуйте еще раз: ");
        } else if (height <= 0) {
            System.out.println("Это слишком мало для ваших питомцев, попробуйте еще раз: ");
        }
    }

    static void checkDistanceSwim(int distance) {

        if (distance > 20) {
            System.out.println("Это слишком большая дистанция для ваших питомцев, попробуйте еще раз: ");
        } else if (distance <= 0) {
            System.out.println("Это слишком маленькая дистанция для ваших питомцев, попробуйте еще раз: ");
        }
    }

    static boolean continuation() {
        System.out.println("Продолжить тренировки? 1 – да / 0 – нет");
        int answer = scanner.nextInt();
        if (answer == 1)
            return true;
        return false;
    }

}
