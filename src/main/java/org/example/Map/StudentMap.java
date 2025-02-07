package org.example.Map;

public class StudentMap {
    private String firstName;
    private String lastName;
    private int studentId;

    public StudentMap(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "StudentMap{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}

