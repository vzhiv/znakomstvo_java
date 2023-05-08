package org.example.seminar03.task02;

import java.util.Arrays;
import java.util.List;

public class Student {
    String surname;
    Integer numberGroup;
    Double salary;
    List<Integer> balls;


    public Student(String surname, Integer numberGroup, Double salary, List<Integer> balls) {
        this.surname = surname;
        this.numberGroup = numberGroup;
        this.salary = salary;
        this.balls = balls;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", numberGroup=" + numberGroup +
                ", salary=" + salary +
                ", balls=" + balls +
                '}';
    }
}
