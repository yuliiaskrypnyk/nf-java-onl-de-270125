package org.example.Inheritance;

public class Vehicle {
    private String model;
    private String manufacturer;
    private int yearOfManufacture;

    public Vehicle(String model, String manufacturer, int yearOfManufacture) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void displayInfo() {
        System.out.print("Model: " + model + "; Manufacturer: " + manufacturer + "; Year of Manufacture: " + yearOfManufacture);
    }
}
