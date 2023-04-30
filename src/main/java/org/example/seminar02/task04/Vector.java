package org.example.seminar02.task04;

public class Vector { // alt + insert
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длина вектора
     */
    public double vectorLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double vectorSraliar(Vector twoVector){
        return x*twoVector.x+y*twoVector.y+z*twoVector.z;
    }

    public Vector vectorPr(Vector twoVector){
        return new Vector(
                y * twoVector.z - z * twoVector.y,
                z * twoVector.x - x * twoVector.z,
                x * twoVector.y - y * twoVector.x
        );
    }

    public double vectorCorner(Vector twoVector){
        return vectorSraliar(twoVector) / (vectorLength() * twoVector.vectorLength());
    }

    public Vector vectorSum(Vector twoVector){
        return new Vector(
                x + twoVector.x,
                y + twoVector.y,
                z + twoVector.z
        );
    }

    public Vector vectorDiff(Vector twoVector){
        return new Vector(
                x - twoVector.x,
                y - twoVector.y,
                z - twoVector.z
        );
    }
}
