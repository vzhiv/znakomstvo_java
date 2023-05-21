package org.example.seminar06.task01;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        printUnic(array);
    }

    /**
     * @param array исходный массив
     * @apiNote Дан массив чисел, посчитать процент уникальных чисел.
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    private static void printUnic(List<Integer> array) {
        Set<Integer> integerSet = new HashSet<>(array);
        double result = (integerSet.size() * 100) / array.size();
        System.out.println("result = " + result);
    }
}
