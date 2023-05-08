package org.example.seminar03.task03;

/*
Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
- количество кубиков желтого цвета и их суммарный объем;
           - количество деревянных кубиков с ребром 3 см

 */

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<Cube> cubes = getCubes();
        int amountYellow = 0;
        float volumeYellow = 0;
        int amountWood = 0;
        for(Cube cube: cubes) {
            if(cube.color.equals("yellow")) {
                amountYellow += 1;
                volumeYellow+= cube.getVolume();
            }
            if(cube.material.equals("wood")) {
                amountWood += 1;

            }
        }

        System.out.println(amountYellow);
        System.out.println(volumeYellow);
        System.out.println(amountWood);

    }

    public static ArrayList<Cube> getCubes() {
        ArrayList<Cube> cubes = new ArrayList<Cube>();
        cubes.add(new Cube(2,"red", "wood"));
        cubes.add(new Cube(3,"yellow", "paper"));
        cubes.add(new Cube(7,"yellow", "wood"));
        cubes.add(new Cube(3,"green", "steel"));
        cubes.add(new Cube(1,"yellow", "steel"));
        return cubes;
    }
}
