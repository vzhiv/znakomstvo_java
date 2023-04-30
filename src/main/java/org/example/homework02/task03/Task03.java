package org.example.homework02.task03;

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количестов чисел в массиве: ");
        int num = iScanner.nextInt();
        changeElementArray(fillArray(num));
        iScanner.close();

    }

    /**
     *
     * @param num количество элементов массива
     * @return массив заполненный случайными числами
     */
    public static int[] fillArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom();
            System.out.printf(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    /**
     *
     * @return получение случайного числа в диапазоне от -2147483648 до 2147483648
     */
    public static int getRandom() {
        int n = (int) (-100 + Math.random() * (100 - (-100)));

        return n;
    }

    /**
     *
     * @param array получаем исходный массив
     */
    static void changeElementArray(int[] array) {
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int digitCount = (int) (Math.log10(array[i]) + 1);
            if (digitCount == 2) {
                sumIndex += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sumIndex;

            }
            System.out.printf(array[i] + " ");
        }
    }
}
