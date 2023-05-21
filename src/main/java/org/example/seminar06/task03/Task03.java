package org.example.seminar06.task03;

/*
3) Найти пересечения слов в массивах и указать их общее количество.
Пример:
Mas1= [“qwe”,”asd”,”qwe”,”x”]
Mas2=[“qwe”,”v”]
Результат:
qwe=3

 */

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe","v", "asd"));
        Set<String> retain = getRetain(mas1, mas2);
        for (String str : retain) {
            System.out.println(str + " = " + (counter(mas1, str) + counter(mas2, str)));
        }
    }


    public static Set<String> getRetain(List<String> arr1, List<String> arr2)
    {
        Set<String> set1 = new HashSet<>(arr1);
        Set<String> set2 = new HashSet<>(arr2);
        Set<String> retainSet= new HashSet<>(set1);
        retainSet.retainAll(set2);
        return retainSet;
    }

    public static int counter(List<String> list, String str){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(str)){
                count++;
            }
        }
        return count;
    }
}
