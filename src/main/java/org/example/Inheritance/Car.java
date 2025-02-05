package org.example.Inheritance;

public class Car extends Vehicle {
    protected int numberOfDoor;

    public Car(String model, String manufacturer, int yearOfManufacture, int numberOfDoor) {
        super(model, manufacturer, yearOfManufacture);
        this.numberOfDoor = numberOfDoor;
    }

    public void displayCarInfo() {
        super.displayInfo();
        System.out.println("Number of Door: " + numberOfDoor);
    }
}

