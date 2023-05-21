package org.example.seminar06.task04;

public class FahrenheitConverter implements Converter{
    @Override
    public double convertValue(double grad){
        return grad  * (9 / 5 + 32);
    }
}
