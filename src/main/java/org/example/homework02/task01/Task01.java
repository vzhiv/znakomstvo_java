package org.example.homework02.task01;

// Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;


public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количестов чисел в последованности: ");
        int num = iScanner.nextInt();
        System.out.println(sumSimpleNum(num, iScanner));
        iScanner.close();

    }

    /**
     *
     * @param num количество чисел в последовательности
     * @return сумма простых чисел в последовательности
     */
    public static int sumSimpleNum(int num, Scanner iScanner) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int number = iScanner.nextInt();
            if (findSimple(number)) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     *
     * @param num число на провеку
     * @return является исходное число простым или нет
     */
    public static boolean findSimple(int num){
        boolean flag = true;
        if (num == 1) return true;
        else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;

    }
}
