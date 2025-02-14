package org.example.Lombok;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Ms.Anna", "Math");

        Student student1 = new Student(1, "Bob", "Street 1", 1.5);
        Student student2 = new Student(2, "Max", "Street 123", 3.0);

        Course course = new Course(1, "Math+", teacher, Arrays.asList(student1, student2));

        System.out.println(teacher);
        System.out.println(course);

        System.out.println(student1.getName());
        student1.setName("Nick");
        System.out.println(student1.getName());

        System.out.println(student1.equals(student2));

        Student student3 = new Student(2, "Max", "Street 123", 2.0);
        System.out.println(student2.equals(student3));


        Student student4 = Student.builder()
                .id(4)
                .name("Rob")
                .address("Street 4")
                .grade(2.2)
                .build();

        System.out.println(student4);

/*        Student newNameStudent = student1.withName("Bob New");
        System.out.println(newNameStudent.getName());

        Student newAddressStudent = student1.withAddress("Street 90");
        System.out.println(newAddressStudent.getAddress());*/

        University university = new University(1, "University Name", List.of(course));
        System.out.println(university);

        UniversityService universityService = new UniversityService();
        double courseAverage = universityService.calculateAverageGradeOfCourse(course);
        System.out.println("courseAverage: " + courseAverage);

        double universityAverage = universityService.calculateAverageGradeOfUniversity(university);
        System.out.println("universityAverage: " + universityAverage);

        List<Student> goodStudents = universityService.getStudentsWithMinimumGrade(university, 2.0);
        System.out.println("goodStudents: " + goodStudents);
    }
}
