package org.example.List;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", "New", 1234));
        students.add(new Student("Tom", "Cod", 1235));

        for (Student student : students) {
            System.out.println(student);
        }

        School school = new School();
        school.addStudent(new Student("Anna", "New", 1234));
        school.addStudent(new Student("Tom", "Cod", 1235));

        for (Student student : school.getStudents()) {
            System.out.println(student);
        }

        Student student = school.findStudentById(1234);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found");
        }

        school.removeStudentById((1234));

        System.out.println(school);
    }
}
