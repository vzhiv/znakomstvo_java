package org.example.homework05.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово которе необходимо найти: ");
        String word = iScanner.nextLine();
        System.out.println("Слово " + word + " встречается в тексте " + findWord(word) + " раз(а)");
        iScanner.close();
    }

    public static Integer findWord(String word) {
        Map<String, Integer> map = new HashMap<>();
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] arrayText = text.split(" ");
        map.putIfAbsent(word, 0);
        for (int i = 0; i < arrayText.length; i++) {
            if (map.containsKey(arrayText[i])) {
                map.put(word, map.get(word) + 1);
            }
        }
        return map.get(word);
    }
}
