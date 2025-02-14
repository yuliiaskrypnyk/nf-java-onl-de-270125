package org.example.Lombok;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {
    public double calculateAverageGradeOfCourse(Course course) {
        double totalGrade = 0.0;
        for (Student student : course.getStudents()) {
            totalGrade += student.getGrade();
        }
        return totalGrade / course.getStudents().size();
    }

    public double calculateAverageGradeOfUniversity(University university) {
        double totalGrade = 0.0;
        int totalStudents = 0;
        for (Course course : university.courses()) {
            for (Student student : course.getStudents()) {
                totalGrade += student.getGrade();
                totalStudents++;
            }
        }
        return totalStudents == 0 ? 0.0 : totalGrade / totalStudents;
    }

    public List<Student> getStudentsWithMinimumGrade(University university, double minGrade) {
        List<Student> studentsWithGoodGrades = new ArrayList<>();

        for (Course course : university.courses()) {
            for (Student student : course.getStudents()) {
                if (student.getGrade() >= minGrade) {
                    studentsWithGoodGrades.add(student);
                }
            }
        }
        return studentsWithGoodGrades;
    }
}
