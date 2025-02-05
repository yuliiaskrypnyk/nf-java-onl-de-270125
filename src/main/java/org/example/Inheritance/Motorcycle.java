package org.example.Inheritance;

public class Motorcycle extends Vehicle {
    private String typeOfMotorcycle;
    private int speed;

    public Motorcycle(String model, String manufacturer, int yearOfManufacture, String typeOfMotorcycle, int speed) {
        super(model, manufacturer, yearOfManufacture);
        this.typeOfMotorcycle = typeOfMotorcycle;
        this.speed = speed;
    }

    public String getMotorcycleType() {
        return typeOfMotorcycle;
    }

    public void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Motorcycle Type: " + getMotorcycleType() + "; Speed: " + speed);
    }
}
