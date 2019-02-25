package HW_6;

import java.text.MessageFormat;
import java.util.Random;

class Dog extends  Animal {

    Random random = new Random();
    int res_run = random.nextInt(600);
    double res_jump = random.nextDouble();
    int res_swim = random.nextInt(10);

    Dog (String name, String breed, String character) {
        this.name = name;
        this.breed = breed;
        this.character = character;
    }

    boolean runDog(int distance) {
        if (moveAnimal(res_run, distance)) {
            System.out.println(MessageFormat.format(
                    "{0} сумел пробежать {1} м. Какой молодец!", name, distance));
        } else {
            System.out.println(MessageFormat.format(
                    "{0} не справился c дистанцией {1} м! Подбодрите его!", name, distance));
        }
        return true;
    }

    boolean jumpDog(int height) {
        if (moveAnimal(res_jump, height)) {
            System.out.println(MessageFormat.format(
                    "{0} сумел подпрыгнуть на {1} м. Похвалите его!", name, height));
        } else {
            System.out.println(MessageFormat.format(
                    "{0} не допрыгнул до {1} м. Продолжайте тренировать его!", name, height));
        }
        return true;
    }

    boolean swimDog(int distance) {
        if (moveAnimal(res_swim, distance)) {
            System.out.println(MessageFormat.format(
                    "{0} проплыл все {1} м. Какой молодец!", name, distance));
        } else {
            System.out.println(MessageFormat.format(
                    "{0} не смог одолеть заплыв на {1} м. Все равно похвалите его!", name, distance));
        }
        return true;
    }

}
