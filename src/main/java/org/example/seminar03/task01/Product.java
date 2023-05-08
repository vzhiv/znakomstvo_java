package org.example.seminar03.task01;

public class Product {
    String name;
    String country;
    Integer volume;

    public Product(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                '}';
    }
}
