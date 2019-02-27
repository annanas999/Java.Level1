package HW_7;

import java.text.MessageFormat;
import java.util.Random;

class Plate {

    Random random = new Random();
    private double food;

    Plate(double food) {
        this.food = food;
    }

    boolean decreaseFood(double n) {
        food = Math.max((food - n), -0.1);
        return (food >= 0);

    }

    void addFood () {
        if (food<=0) {
            food = random.nextInt(600);
        }
        System.out.println(MessageFormat.format("В миску добавлено {0} еды. Приятного аппетита!", food));

    }

    void show() {
        System.out.println(MessageFormat.format("В миске {0} еды", Math.ceil(food)));
    }

}
