package org.example.Map;

import java.util.Map;

public class SchoolMap {
    private Map<String, StudentMap> students;

    public SchoolMap(Map<String, StudentMap> students) {
        this.students = students;
    }

    public Map<String, StudentMap> getStudents() {
        return students;
    }

    public void addStudent(StudentMap student) {
        students.put(student.getName(), student);
    }

    public StudentMap findStudentById(int studentId) {
        for (StudentMap student : students.values()) {
            if (studentId == student.getStudentId()) {
                return student;
            }
        }
        return null;
    }

    public void removeStudentById(int studentId) {
        StudentMap student = findStudentById(studentId);
        if (student != null) {
            students.remove(student.getName());
            System.out.println("Student with ID " + studentId + " has been removed");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    @Override
    public String toString() {
        return "SchoolMap{" +
                "students=" + students +
                '}';
    }
}
