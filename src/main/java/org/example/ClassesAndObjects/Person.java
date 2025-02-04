package org.example.ClassesAndObjects;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduceText() {
        System.out.println("Hello, I am " + name + " and " + age + " years old.");
        //String.format("Hello, I'm %s. My gender is %s, and I'm %d years old.", name, gender, age)
        //System.out.printf("Hello, I'm %s. My gender is %s, and I'm %d years old.%n", name, gender, age);
    }
}
