package org.example.DateAndTime.Bonus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", LocalDate.of(2000, 1, 10));

        System.out.println("Days left until " + animal.getName() + "'s next birthday: " + animal.daysUntilNextBirthday() + " days.");
    }
}