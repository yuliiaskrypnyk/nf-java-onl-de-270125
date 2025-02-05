package org.example.Inheritance;

public class Vehicle {
    protected String model;
    protected String manufacturer;
    protected int yearOfManufacture;

    public Vehicle(String model, String manufacturer, int yearOfManufacture) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + "; Manufacturer: " + manufacturer + "; Year of Manufacture: " + yearOfManufacture);
    }
}
