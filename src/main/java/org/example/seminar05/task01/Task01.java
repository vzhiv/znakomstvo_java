package org.example.seminar05.task01;

/*
1)	Посчитать количество вхождений каждого символа в текст.
 */

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String text = "kljdfkbsdfbklakjf";
        for (int i = 0; i < text.length(); i++) {
            map.putIfAbsent(text.charAt(i), 0);
            map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
//            if(map.containsKey(text.charAt(i))) {
//                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
//            }
//            else {
//                map.put(text.charAt(i), 1);
//            }
        }
        for(var entry: map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
