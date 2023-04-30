package org.example.seminar02.task02;

/*
Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количестов чисел в последованности: ");
        int num = iScanner.nextInt();
        System.out.println(sumFive(num, iScanner));
        iScanner.close();

    }

    /**
     *
     * @param num количество чисел в последовательности
     * @return сумма чисел оканчивающаяся на 5 и перед которыми идет четное число
     */
    public static int sumFive(int num, Scanner iScanner){
        int sum = 0;
        int num1 = iScanner.nextInt();
        for (int i = 1; i < num; i++) {
            int num2 = iScanner.nextInt();;
            if (num1 % 2 == 0 && num2 % 5 == 0){
                sum+= num2;
            }
            num1 = num2;
        }
        return sum;
    }
}
