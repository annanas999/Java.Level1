package HW_5.BaseTask;

public class Mymain {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов И.И.", "Frontend developer", "ivanov@email.com", "89131234567", 100000, 35);
        persArray[1] = new Person("Петров П.П.", "Backend developer", "petrov@email.com", "89992345678", 100000, 55);
        persArray[2] = new Person("Сидорова С.С.", "PHP developer", "sidorova@email.com", "89853456789", 120000, 40);
        persArray[3] = new Person("Сергеев С.С.", "Senior developer", "sergeev@email.com", "89674567891", 150000, 45);
        persArray[4] = new Person("Иванова И.И.", "Mobile developer", "ivanova@email.com", "89685678912", 120000, 25);

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].printInfo();

        }
        System.out.println("Список сотрудников старше 40 лет");

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].showAge();

        }


    }


}
