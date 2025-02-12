package org.example.Stream;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int postalCode;
    private int age;

    public Student(int id, String name, int postalCode, int age) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', postalCode=" + postalCode + ", age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && postalCode == student.postalCode && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, postalCode, age);
    }
}
