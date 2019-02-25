package HW_5.BaseTask;

import java.text.MessageFormat;

public class Person {

    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printInfo() {
        System.out.println(MessageFormat.format(
                "Имя: {0}, должность: {1}, email: {2}, телефон: {3}, зарплата: {4}, возраст: {5}",
                name, position, email, phone, salary, age));
    }

    public void showAge() {
        if (age >= 40)
            printInfo();
    }


}
