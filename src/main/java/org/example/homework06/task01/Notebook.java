package org.example.homework06.task01;

public class Notebook {
    Integer id;
    String brand;
    String model;
    Integer ram;
    Integer hdd;
    String system;
    String color;


    public Notebook(Integer id, String brand, String model, Integer ram, Integer hdd, String system, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.system = system;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", system='" + system + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

