package org.example.homework01.task02;

/*
Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел, для завершения ввода введите 0, после ввода каждого числа нажимайте Enter: ");
        System.out.println(sumDiff(iScanner));
        iScanner.close();

    }

    /**
     *
     * @return сумма положительных чисел идущих перед отрицательными
     */
    public static int sumDiff(Scanner iScanner){
        int sum = 0;
        int num1 = iScanner.nextInt();
        while (num1 != 0){
            int num2 = iScanner.nextInt();
            if (num1 > 0 && num2 < 0){
                sum += num1 ;
            }
            num1 = num2;
        }
        return sum;
    }
}
