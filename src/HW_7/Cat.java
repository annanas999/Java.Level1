package HW_7;

import java.text.MessageFormat;

class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    boolean eat(Plate p) {
        if (p.decreaseFood(appetite))
            satiety = true;

        return true;

    }

    void satiety() {
        if (satiety) {
            System.out.println(MessageFormat.format("{0} насытился!", name));
        } else {
            System.out.println(MessageFormat.format("{0} не хватило еды в миске!", name));
        }
    }


}
