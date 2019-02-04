package Lesson_1; 

// 1. а

import static java.lang.Math.floorMod;
import static java.lang.Math.random;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        printHello("Anna");
        System.out.println("Результат " + getCalc(6,3,9,34));
        getNum(-56);
        System.out.println("Ваше число " + getRandom(16,199));
        getSquare(4,4,4);
    }


// 2.

    byte aByte = 27;
    short aShort = 123;
    int anInt = 999;
    long aLong = 100000000;
    float aFloat = 124.0F;
    double aDouble = 123.0;
    boolean aBoolean = true; // ||false
    char aChar = '*';
    String string = "Hello";


// 7.

    public static void printHello (String name) {
        System.out.println("Hello, " + name + "!");
    }

//3.
    public static int getCalc (int a, int b, int c, int d) {
        int result = a*(b+ (c/d));
        return result;
    }



//4.

//    public static int getSum (int a, int b) {
//        if ((a+b)>=10 && (a+b)<=20) {
//            return "true";
//        } else {
//            return "false";
//        }


//5.

    public static void getNum (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

//13.

    public static double getRandom (int min, int max) {
        double x = Math.floor (Math.random() * (max-min+1)+min);
        return x;
    }


// 18.
    public static void getSquare (int x, int y, int z) {
        if (x == z && y == z) {
            System.out.println("Все три числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}
