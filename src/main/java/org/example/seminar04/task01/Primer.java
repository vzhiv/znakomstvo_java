package org.example.seminar04.task01;

import java.util.LinkedList;
import java.util.Scanner;

public class Primer {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("peek = " + integerLinkedList.peek());
        System.out.println("list= " + integerLinkedList);
        System.out.println("pop = " + integerLinkedList.pop());
        System.out.println("list= " + integerLinkedList);
//добавим вначало
        integerLinkedList.addFirst(3);
        System.out.println("add first list= " + integerLinkedList);
//добавление в конец
        integerLinkedList.addLast(7);
        System.out.println("add last list= " + integerLinkedList);
//замена элемента
        integerLinkedList.set(2, 6);
        System.out.println("set elem list= " + integerLinkedList);
//проверить на наличие
        //System.out.println("s
    }
}
