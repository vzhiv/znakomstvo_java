package org.example.seminar01.task01;

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        System.out.println(subtractProductAndSum(num));

    }

    /**
     *
     * @param number = заданное число
     * @return произведение цифр - сумма цифр
     */
    public static int subtractProductAndSum(int number) {

        int sum = 0;
        int mult = 1;
        while (number > 0) {
            int temp = number % 10;
            sum += temp;
            mult *= temp;
            number /= 10;
        }
        int result = mult - sum;
        return result;
    }
}