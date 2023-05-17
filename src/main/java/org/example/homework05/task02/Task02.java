package org.example.homework05.task02;

/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        Map<String, Integer> map = countName();
        sortName(map);
    }


    public static String[] listName() {
        String[] listName = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин",
                "Иван Ежов"};
        return listName;
    }

    public static Map<String, Integer> countName() {
        Map<String, Integer> map = new TreeMap<>();
        String[] listNames = listName();
        for (String listName : listNames) {
            String[] names = listName.split(" ");
            map.putIfAbsent(names[0], 0);
            map.put(names[0], map.get(names[0]) + 1);
        }
        return map;
    }

    public static void sortName(Map<String, Integer> map) {
        ArrayList<Integer> listCount = new ArrayList<>();
        for (var item : countName().entrySet()) {
            if (!listCount.contains(item.getValue())) {
                listCount.add(item.getValue());
            }
        }
        Collections.sort(listCount);
        for (int i = listCount.size() - 1; i > -1; i--) {
            for (var item : map.entrySet()) {
                if ((listCount.get(i) == item.getValue() && item.getValue() > 1)) {
                    System.out.println(item.getKey() + " = " + item.getValue());
                }
            }
        }
    }
}
