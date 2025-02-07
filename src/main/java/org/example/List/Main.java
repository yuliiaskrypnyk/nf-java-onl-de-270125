package org.example.List;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yuliia", "Skrypnyk", 1234));
        students.add(new Student("Tom", "Cod", 1235));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
