package org.example.homework04.task01;

/*
1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */

import java.util.Arrays;
import java.util.LinkedList;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.pollLast());
        }

        System.out.println(list);
    }
}
