package org.example.DateAndTime.Bonus;

import lombok.Getter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter
public class Animal {
    private final String name;
    private final LocalDate birthday;

    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public long daysUntilNextBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthday.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(today, nextBirthday);
    }
}