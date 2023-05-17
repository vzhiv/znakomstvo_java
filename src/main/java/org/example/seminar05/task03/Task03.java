package org.example.seminar05.task03;

/*
Написать перевод из Римских цифр в арабские:
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Примеры:
1)	ввод: s = "LVIII"
              вывод: 58
              разбор: L = 50, V= 5, III = 3.
2)	ввод: s = "MCMXCIV"
вывод: 1994
разбор: M = 1000, CM = 900, XC = 90 and IV = 4.

 */

import java.util.HashMap;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) {
        Map<Character , Integer> map = fillMap();
        System.out.println(convert("MMMCDLXXXVIII", map));
    }

    public static Integer convert(String str, Map<Character, Integer> map) {
        Integer result = map.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result -= map.get(str.charAt(i));
            }
            else {
                result += map.get(str.charAt(i));
            }
        }
        return result;
    }

    public static Map<Character, Integer> fillMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
