package org.example.Record;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Maryna", 31, "Street 1");
        Owner owner2 = new Owner("Yuliia", 30, "Street 2");

        Species dogSpecies = new Species("Dog", 200);
        Species catSpecies = new Species("Cat", 100);

        Animal dog = new Animal(1, "Doggie", dogSpecies, 10, owner1);
        Animal cat = new Animal(1, "Kitty", catSpecies, 2, owner2);

        System.out.println(cat.equals(dog));

        System.out.println(cat);
        System.out.println(cat.name());
        System.out.println(cat.owner());
        System.out.println(cat.species());

        System.out.println(dog);
    }
}
