package org.example.Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    private List<Person> persons;

    public PersonRepository() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public void printPersonInfo(Optional<Person> personOptional) {
        personOptional.ifPresent(person -> {
            System.out.println("Name: " + person.name() + "; Favorite Day: " + person.favoriteDay());
        });

        if (personOptional.isEmpty()) {
            System.out.println("Person not found");
        }
    }
}
