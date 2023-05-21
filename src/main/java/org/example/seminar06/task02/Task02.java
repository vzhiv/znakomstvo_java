package org.example.seminar06.task02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task02 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,5,6,7));
        System.out.println("cross(set1, set2) = " + cross(set1, set2));
    }

    /**
     * @apiNote Найти пересечение двух множеств
     * Пример:
     * set1= [1,2,3,4]
     * set2= [3,5,6,7]
     * Вывод в консоль:
     * [3]
     * @param set1 1 множество
     * @param set2 2 множество
     */
    private static Set<Integer> cross(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> retainSet = new HashSet<>(set1);
        retainSet.retainAll(set2);
        return retainSet;
    }
}
