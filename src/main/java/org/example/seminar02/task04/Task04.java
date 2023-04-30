package org.example.seminar02.task04;

/*
4) Задача на ООП (пригодится для дз и итогового проекта):

1) Проектирование и создание класса, описывающего вектор
Задача:

Создайте класс, который описывает вектор (в трёхмерном пространстве).

У него должны быть:


•	конструктор с параметрами в виде списка координат x, y, z
•	метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():

•	метод, вычисляющий скалярное произведение:

•	метод, вычисляющий векторное произведение с другим вектором:

•	метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному
произведению векторов, деленному на произведение модулей (длин) векторов:

•	методы для суммы и разности:


 */

public class Task04 {
    public static void main(String[] args) {
        Vector vector = new Vector(1.0, 2.0,3.0);
        Vector vector2 = new Vector(2.0, 4.0,7.0);
        System.out.println("vector = " + vector);
        System.out.println(vector.vectorLength());
        System.out.println(vector.vectorSraliar(vector2));
        System.out.println(vector.vectorPr(vector2));
        System.out.println(vector.vectorCorner(vector2));
        System.out.println(vector.vectorSum(vector2));
        System.out.println(vector.vectorDiff(vector2));
    }
}
