package org.example.seminar03.task03;

public class Cube {
    float length;
    String color;
    String material;

    public Cube(float length, String color, String material) {
        this.length = length;
        this.color = color;
        this.material = material;
    }

    public float getVolume(){
        return length * length * length;
    }
}
