package org.example.homework02.task02;

//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количестов чисел в последованности: ");
        int num = iScanner.nextInt();
        System.out.println(incSeq(num, iScanner));
        iScanner.close();

    }

    /**
     *
     * @param num количество чисел в последовательности
     * @return является ли последовательность возрастающей
     */
    public static boolean incSeq(int num, Scanner iScanner) {
        int result = 0;
        int num1 = iScanner.nextInt();
        for (int i = 1; i < num; i++) {
            int num2 = iScanner.nextInt();
            if (num2 < num1) {
                result += 1;
            }
            num1 = num2;
        }
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}
