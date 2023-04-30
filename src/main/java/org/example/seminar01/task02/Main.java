package org.example.seminar01.task02;

import java.util.Scanner;

// Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количестов чисел в последованности: ");
        int num = iScanner.nextInt();
        System.out.println(countDiff(num, iScanner));
        iScanner.close();

    }

    /**
     *
     * @param num количество чисел в последовательности
     * @return кол-во положительных чисел идущих перед отрицательными
     */
    public static int countDiff(int num, Scanner iScanner){
        int count = 0;
        int num1 = iScanner.nextInt();
        for (int i = 1; i < num; i++) {
            int num2 = iScanner.nextInt();;
            if (num1 > 0 && num2 < 0){
                count++;
            }
            num1 = num2;
        }
        return count;
    }
}
