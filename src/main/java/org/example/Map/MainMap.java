package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, StudentMap> students = new HashMap<>();

        students.put("Anna", new StudentMap("Anna", "New", 1234));
        students.put("Tom", new StudentMap("Tom", "Cod", 1235));

        for (StudentMap student : students.values()) {
            System.out.println(student);
        }

        SchoolMap school = new SchoolMap(students);

        school.addStudent(new StudentMap("Anna", "New", 1234));
        school.addStudent(new StudentMap("Tom", "Cod", 1235));

        for (StudentMap student : school.getStudents().values()) {
            System.out.println(student);
        }

        StudentMap student = school.findStudentById(1234);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found");
        }

        school.removeStudentById((1234));

        System.out.println(school);
    }
}
