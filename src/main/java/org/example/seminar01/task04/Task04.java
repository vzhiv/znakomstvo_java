package org.example.seminar01.task04;

import java.util.Scanner;

// Given two binary strings a and b, return their sum as a binary string.
public class Task04 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите 1-ую бинарную строку: ");
        String str1 = iScanner.nextLine();
        System.out.printf("Введите 2-ую бинарную строку: ");
        String str2 = iScanner.nextLine();
        System.out.println(addBinary(str1, str2));
        iScanner.close();
    }

    /**
     *
     * @param str1 1-ая бинарная строка
     * @param str2 2-ая бинарная строка
     * @return сумма бинарных строк
     */
    public static String addBinary(String str1, String str2){
        int mem = 0;
        String result = "";

        while(str1.length() > str2.length()){
            str2 = "0" + str2;
        }

        while(str2.length() > str1.length()){
            str1 = "0" + str1;
        }


        for (int i = str1.length() - 1; i >= 0; i--) {

            if (str1.charAt(i) == '0' && str2.charAt(i) == '0') {

                if(mem == 0) {
                    result = 0 + result;
                }
                else{
                    result = 1 + result;
                    mem = 0;
                }
            }
            else if (str1.charAt(i) == '1' && str2.charAt(i) == '1') {

                if(mem == 1) {
                    result = 1 + result;
                }
                else {
                    result = 0 + result;
                    mem = 1;
                }
            }
            else {

                if(mem == 1){
                    result = 0 + result;
                }
                else{
                    result = 1 + result;
                }
            }
        }
        if(mem == 1) result = 1 + result;

        return result;

    }
}
