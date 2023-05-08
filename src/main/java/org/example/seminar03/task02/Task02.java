package org.example.seminar03.task02;

/*
2.	Дан массив объектов: фамилия студента, номер группы,
размер стипендии, баллы по 3 предметам. Определить стипендии студентов,
фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        List<Student> students = GetStudent();
        for(Student student: students){
            if(student.surname.endsWith("on")){
                int sum = 0;
                for(Integer ball: student.balls) {
                    sum += ball;
                }
                if (sum % 2 == 0) {
                    System.out.printf(student.surname + " ");
                    System.out.println(student.salary);
                }
            }
        }
    }

    public static List<Student> GetStudent() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("name1on", 1111, 1000.0, Arrays.asList(1,2,3)));
        students.add(new Student("name2", 2222, 1200.0, Arrays.asList(0,4,3)));
        students.add(new Student("name3on", 3333, 1300.0, Arrays.asList(1,3,3)));
        students.add(new Student("name4", 4444, 1400.0, Arrays.asList(1,2,5)));
        students.add(new Student("name5", 2222, 1500.0, Arrays.asList(2,2,2)));
        students.add(new Student("name6", 3333, 1100.0, Arrays.asList(1,4,3)));
        students.add(new Student("name7on", 5555, 1200.0, Arrays.asList(6,2,5)));

        return students;
    }
}
