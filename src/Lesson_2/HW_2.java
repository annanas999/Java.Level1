package Lesson_2;

import java.util.Arrays;

public class HW_2 {
    public static void main(String[] args) {

//1.
        int[] elem = {0, 0, 1, 0, 1, 0};
        for (int i = 0; i < elem.length; i++) {
            if (elem[i] == 0) {
                elem[i] = 1;
            } else {
                elem [i] = 0;
            }
            System.out.print(elem [i] + " ");
        }
        System.out.println();


//2.
    int [] arr = new int [8];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i*3;
            System.out.print(arr [i] + " ");
        }
        System.out.println();

//3.

    int [] arrs = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] < 6) {
                arrs [i] = arrs [i] *2;
            }
            System.out.print(arrs [i] + " ");
        }
        System.out.println();

//4.

    int[][] mass = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mass [i][i] = 1;
            }
            System.out.println(Arrays.toString(mass[i]));
        }

//5.

     int [] mm = {9, 5, 14, 6, 1, 8, 3, 2, 10};
        int min = mm[0], max = mm[0], minin = 0, maxin = 0;
        for (int i = 0; i < mm.length; i++) {
            if (mm[i]<min) {
                min = mm[i];
                minin = i;
            }
            if (mm[i]>max) {
                max = mm[i];
                maxin = i;
            }
        }
        System.out.println("min элемент "+ min+" с индексом "+minin);
        System.out.println("max элемент "+ max+" с индексом "+maxin);



// 6.

        int [] array = {1,2,3,4,5,5};
        boolean balance;
        balance = chekBalance(array);
        System.out.println(balance);

// 7.

        int[] massiv = {2,4,6,8,10,12,14};
        cycleElem (massiv, 3);
        System.out.println(Arrays.toString(massiv));


    }


//6.
    private static boolean chekBalance (int [] array) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum = leftSum + array[i];
        }
        if (leftSum % 2 != 0) {
            return false;
        }
        for (int i : array) {
            rightSum += i;
            if (rightSum == leftSum / 2) {
                return true;
            }
        } return false;
    }


// 7.
    private static int [] cycleElem (int[] massiv, int n) {
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    int temp = massiv[0];
                    massiv[0] = massiv[massiv.length - 1];
                    for (int j = 1; j < massiv.length - 1; j++) {
                        massiv[massiv.length - j] = massiv[massiv.length - j - 1];
                    }
                    massiv[1] = temp;
                }
            }
            else if (n < 0) {
                for (int i = 0; i > n; i--) {
                    int temp = massiv[massiv.length - 1];
                    massiv[massiv.length - 1] = massiv[0];
                    for (int j = 1; j < massiv.length - 1; j++) {
                        massiv[j - 1] = massiv[j];
                    }
                    massiv[massiv.length - 2] = temp;
                }
            }
        return massiv;
    }

}











