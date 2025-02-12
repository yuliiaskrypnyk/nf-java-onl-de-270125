package org.example.Enum;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.getDayType(Days.MONDAY));
        System.out.println(DaysOfWeek.getDayType(Days.SUNDAY));

        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(new Person(1, "Anna", Days.FRIDAY));

        Optional<Person> person1 = personRepository.getPersonById(1);
        Optional<Person> person2 = personRepository.getPersonById(0);

        personRepository.printPersonInfo(person1);
        personRepository.printPersonInfo(person2);
    }
}
