package org.example.seminar05.task02;

/*
2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
В противном случае (false).
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> array = fillArray();
        System.out.println(test(array));
    }

    private static ArrayList<Integer> fillArray() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(1);
        }
        array.add(2);
        array.add(5);
        return array;
    }

    public static boolean test(ArrayList<Integer> array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : array) {
            map.putIfAbsent(integer, 0);
            map.put(integer, map.get(integer) + 1);
            if (map.get(integer) > 1) {
                return false;
            }

        }

        return true;
    }
}
