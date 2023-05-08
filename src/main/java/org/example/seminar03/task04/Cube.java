package org.example.seminar03.task04;

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

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cube cube = (Cube) o;

        if (Float.compare(cube.length, length) != 0) return false;
        if (!color.equals(cube.color)) return false;
        return material.equals(cube.material);
    }

    @Override
    public int hashCode() {
        int result = (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + color.hashCode();
        result = 31 * result + material.hashCode();
        return result;
    }
}
