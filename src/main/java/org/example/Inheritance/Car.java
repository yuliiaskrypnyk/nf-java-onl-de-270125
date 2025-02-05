package org.example.Inheritance;

public class Car extends Vehicle {
    private int numberOfDoor;

    public Car(String model, String manufacturer, int yearOfManufacture, int numberOfDoor) {
        super(model, manufacturer, yearOfManufacture);
        this.numberOfDoor = numberOfDoor;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.print("; Number of Door: " + numberOfDoor);
    }
}

