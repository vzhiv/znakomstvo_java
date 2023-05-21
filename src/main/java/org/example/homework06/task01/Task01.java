package org.example.homework06.task01;

/*
• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task01 {
    public static void main(String[] args) throws IOException {
        menuStart();
    }

    private static void menuStart() throws IOException {
        System.out.println("Приветствуем вас в нашем интеллектуальном подборе ноутбуков");
        System.out.println("Выберите один из пунктов и нажмите Enter");
        int choice;
        do {
            menu();
            choice = choice();
            List<Notebook> notebooksList = listNotebook();
            switch (choice) {
                case 1:
                    showNotebook(notebooksList);
                    break;
                case 2:
                    filterNotebook(notebooksList);
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("1 - вывести все наименования ноутбуков");
        System.out.println("2 - поиск ноутбука по фильтру");
        System.out.println("0 - выход из программы");
    }

    public static Integer choice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ваш выбор: ");
        return sc.nextInt();
    }

    public static String choiceFilter() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static List<Notebook> listNotebook () throws IOException {
        String fileName ="src/main/java/org/example/homework06/task01/1.txt";
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        List<Notebook> notebooksList = new ArrayList<>();
        while (line != null) {
            String[] notebook = line.split(",");
            notebooksList.add(new Notebook(Integer.parseInt(notebook[0]),notebook[1], notebook[2],
                                            Integer.parseInt(notebook[3]), Integer.parseInt(notebook[4]),
                                            notebook[5], notebook[6]));
            line = reader.readLine();
        }
        return notebooksList;
    }

    public static void showNotebook(List<Notebook> notebooksList) {
        System.out.println();
        System.out.println("ID, Бренд, Модель, Память, Диск, Система, Цвет");
        for (Notebook notebook : notebooksList) {
            System.out.println(notebook.id + ", " + notebook.brand + ", "
                             + notebook.model + ", " + notebook.ram + ", "
                             + notebook.hdd + ", " + notebook.system + ", "
                             + notebook.color);
        }
        System.out.println();
    }

    private static void filterNotebook(List<Notebook> notebooksList) {
        Map<String, String> filter = new HashMap<>();
        int choice;
        do {
            menuFilter();
            choice = choice();
            switch (choice) {
                case 1:
                    System.out.print("Введите какой ID ноутбука вы ищите: ");
                    filter.put("id", choiceFilter());
                    break;
                case 2:
                    System.out.print("Введите какого бренда ноутбука вы ищите: ");
                    filter.put("brand", choiceFilter());
                    break;
                case 3:
                    System.out.print("Введите какую модель ноутбука вы ищите: ");
                    filter.put("model", choiceFilter());
                    break;
                case 4:
                    System.out.print("Введите какое минимальное количества памяти в ноутбуке вы ищите: ");
                    filter.put("ram", choiceFilter());
                    break;
                case 5:
                    System.out.print("Введите какой минимальный объема диска в ноутбуке вы ищите: ");
                    filter.put("hdd", choiceFilter());
                    break;
                case 6:
                    System.out.print("Введите какую систему установленную на ноутбуке вы ищите: ");
                    filter.put("system", choiceFilter());
                    break;
                case 7:
                    System.out.print("Введите какого цвета ноутбук вы ищите: ");
                    filter.put("color", choiceFilter());
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);

        List<Notebook> notebooksResult = new ArrayList<>();

        for(Notebook notebook: notebooksList){
            int count = 0;
            if (filter.containsKey("id") && notebook.id.equals(Integer.parseInt(filter.get("id")))) {
                count++;
            }
            if (filter.containsKey("brand") && notebook.brand.equals(filter.get("brand"))) {
                count++;
            }
            if (filter.containsKey("model") && notebook.model.equals(filter.get("model"))) {
                count++;
            }
            if (filter.containsKey("ram") && notebook.ram >= Integer.parseInt(filter.get("ram"))) {
                count++;
            }
            if (filter.containsKey("hdd") && notebook.hdd >= Integer.parseInt(filter.get("hdd"))) {
                count++;
            }
            if (filter.containsKey("system") && notebook.system.equals(filter.get("system"))) {
                count++;
            }
            if (filter.containsKey("color") && notebook.color.equals(filter.get("color"))) {
                count++;
            }

            if (filter.size() == count) {
                notebooksResult.add(notebook);
            }


        }
        if (notebooksResult.size() != 0) {
            showNotebook(notebooksResult);
        }
        else {
            System.out.println();
            System.out.println("По заданным параметрам ничего не найдено");
            System.out.println();
        }

    }

    private static void menuFilter(){
        System.out.println("Выберите один из пунктов и нажмите Enter");
        System.out.println("1 - поиск ноутбука по ID");
        System.out.println("2 - поиск ноутбука по БРЕНДУ");
        System.out.println("3 - поиск ноутбука по МОДЕЛИ");
        System.out.println("4 - поиск ноутбука по размеру ПАМЯТИ");
        System.out.println("5 - поиск ноутбука по размеру ДИСКА");
        System.out.println("6 - поиск ноутбука по СИСТЕМЕ");
        System.out.println("7 - поиск ноутбука по ЦВЕТУ");
        System.out.println("0 - поиск ноутбука по базе");
    }
}
