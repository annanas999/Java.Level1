package HW_6;

import java.text.MessageFormat;

abstract class Animal {

    String name;
    String breed;
    String character;

    Animal () {

    }

    boolean moveAnimal(int restriction, int move) {
        if (restriction >= move)
            return true;
        return false;
    }

    boolean moveAnimal(double restriction, int move) {
        if (restriction >= move)
            return true;
        return false;
    }

    void animalInfo() {
        System.out.println(MessageFormat.format(
                "У вас появился {0} {1}, по имени {2}!",
                character, breed, name));
    }


}
