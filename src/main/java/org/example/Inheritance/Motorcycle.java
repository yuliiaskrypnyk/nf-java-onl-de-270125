package org.example.Inheritance;

public class Motorcycle extends Vehicle {
    protected String type;
    protected int speed;

    public Motorcycle(String model, String manufacturer, int yearOfManufacture, String typeOfMotorcycle, int speed) {
        super(model, manufacturer, yearOfManufacture);
        this.type = typeOfMotorcycle;
        this.speed = speed;
    }

    public String getMotorcycleType() {
        return type;
    }

    public void displayMotorcycleInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Type: " + getMotorcycleType() + "; Speed: " + speed);
    }
}
