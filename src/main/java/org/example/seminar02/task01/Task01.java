package org.example.seminar02.task01;

/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */
import java.util.Scanner;

import static java.lang.Math.*;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число которе необходимо возвести в степень: ");
        double number = iScanner.nextDouble();
        System.out.printf("Введите степень в которую вы хотите возвести число: ");
        int degree = iScanner.nextInt();
        System.out.println(myPow(number, degree));
        iScanner.close();
    }

    public static double myPow(double x, int n) {

        if (x <= -10000 || x >= 10000) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }


        else {
            return x * myPow(x, n - 1);
        }
    }
}
