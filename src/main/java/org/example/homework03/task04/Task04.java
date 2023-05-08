package org.example.homework03.task04;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,1,8,10,9,1);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        IntSummaryStatistics result = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(result);
        Integer min = numbers.get(0);
        Integer max = numbers.get(0);
        Integer sum = 0;
        Double aver = 0.0;
        for (Integer num: numbers) {
            if (min > num) min = num;
            if (max < num) max = num;
            sum += num;
        }
        aver = (double) sum / numbers.size();

        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(aver);
    }


}
