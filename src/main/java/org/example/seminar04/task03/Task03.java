package org.example.seminar04.task03;

/*
Заменить некратные 3 элементы списка, суммой нечетных элементов
 */

import java.util.Arrays;
import java.util.LinkedList;

public class Task03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,25,45,24,26,78,90,100));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) {
                sum += list.get(i);
                System.out.println(list.get(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 !=0) {
                list.set(i, sum);
            }

        }

        System.out.println(list);
    }
}
