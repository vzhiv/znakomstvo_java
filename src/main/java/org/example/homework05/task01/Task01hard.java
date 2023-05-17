package org.example.homework05.task01;

/*
Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
вносить все слова не нужно
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
Запрос: Россия
Ответ: Россия - 2
toLoverCase().
(Усложнение - игнорировать пунктуацию)*
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task01hard {
    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово которе необходимо найти: ");
        String word = iScanner.nextLine();
        System.out.println("Слово " + word + " встречается в тексте " + findWord(word) + " раз(а)");
        iScanner.close();
    }

    /**
     *
     * @param word слово которое ищем в тексте
     * @return количество слова в тексте
     * @throws IOException
     */
    public static Integer findWord(String word) throws IOException {
        int result = 0;
        String text = readFile();
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher find = pattern.matcher(text);
        while (find.find()) {
            result++;
        }

        return result;
    }

    /**
     *
     * @return считываем файл
     * @throws IOException
     */
    public static String readFile() throws IOException {
        String fileName = "src/main/java/org/example/homework05/task01/1.txt";
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}

