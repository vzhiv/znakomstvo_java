package org.example.seminar06.task04;

public class KelvinConverter implements Converter{
    @Override
    public double convertValue(double grad) {
        return grad - 237.150;
    }
}
