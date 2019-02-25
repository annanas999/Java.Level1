package HW_6;

import java.text.MessageFormat;

class Cat extends Animal {

    int res_run = 200;
    int res_jump = 2;
    int res_swim = 0;

    Cat(String name, String breed, String character) {
        this.name = name;
        this.breed = breed;
        this.character = character;
    }

    boolean runCat(int distance) {
        if (moveAnimal(res_run, distance)) {
            System.out.println(MessageFormat.format(
                    "{0} смог пробежать все {1} м. Он молодец, дайте ему рыбки!", name, distance));
        } else {
            System.out.println(MessageFormat.format(
                    "{0} не смог одолеть дистанцию {1} м! Похлопайте приободряюще его по плечу!", name, distance));
        }
        return true;
    }

    boolean jumpCat(int height) {
        if (moveAnimal(res_jump, height)) {
            System.out.println(MessageFormat.format(
                    "{0} cмог подпрыгнуть на {1} м. Он молодец, дайте ему рыбки!", name, height));
        } else {
            System.out.println(MessageFormat.format(
                    "{0} переоценил свою прыгучесть. Ему нужно больше тренироваться!", name));
        }
        return true;
    }

    boolean swimCat(int distance) {
        if (!moveAnimal(res_swim, distance)) {
            System.out.println(MessageFormat.format(
                    "Упс! {0} умеет плавать только на пиратском судне в качестве главнокомандующего. " +
                            "Оставьте его на берегу!", name));
        }
        return true;
    }

}
