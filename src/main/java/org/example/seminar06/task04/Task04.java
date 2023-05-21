package org.example.seminar06.task04;

/*
4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */

public class Task04 {
    public static void main(String[] args) {
        double gradus = 36.60;

        FahrenheitConverter far = new FahrenheitConverter();
        System.out.println(far.convertValue(gradus));

        KelvinConverter kel = new KelvinConverter();
        System.out.println(kel.convertValue(gradus));


    }
}
