package org.example.seminar01.task03;
// Дана строка. Поменять местами ее половины.

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = iScanner.nextLine();
        System.out.println(replacePartOfString(str));
        iScanner.close();
    }

    /**
     *
     * @param str исходная строка
     * @return строка разделенная на 2 части, которые поменяли местами
     */
    public static String replacePartOfString(String str){
        int len = str.length();
        String sub1 = str.substring(0, len / 2);
        String sub2 = str.substring(len / 2, len);
        String result = sub2 + sub1;
        return result;
    }
}
