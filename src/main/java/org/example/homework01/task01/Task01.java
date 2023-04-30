package org.example.homework01.task01;

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = iScanner.nextLine();
        System.out.println(reversePartOfString(str));
        iScanner.close();
    }

    /**
     *
     * @param str исходная строка
     * @return строка в которой слова написаны в обратном порядке и удалены лишние пробелы
     */
    public static String reversePartOfString(String str){
        str = str.trim();
        String[] words = str.split("\\s+");
        String result = "";
        for (int i = words.length-1; i >= 0; i--) {
            if (i != 0) result += words[i] + " ";
            else result += words[i];
        }

        return result;
    }
}

