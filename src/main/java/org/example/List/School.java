package org.example.List;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (studentId == student.getStudentId()) {
                return student;
            }
        }
        return null;
    }

    public void removeStudentById(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            students.remove(student);
            System.out.println("Student with ID " + studentId + " has been removed");
        } else {
            System.out.println("Student with ID 101 not found.");
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
