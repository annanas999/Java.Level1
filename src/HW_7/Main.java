package HW_7;


public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Васька", 200);
        cat[1] = new Cat("Ванька", 250);
        cat[2] = new Cat("Валька", 200);

        Plate plate = new Plate(500);
        plate.show();

        for (Cat cats : cat) {
            cats.eat(plate);
            cats.satiety();

        }

        plate.addFood();
        plate.show();

    }

}
