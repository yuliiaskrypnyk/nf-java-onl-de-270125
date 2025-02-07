package org.example.Map.Pharmacy;

public class Medication {
    private String name;
    private double price;
    private boolean isAvailable;

    public Medication(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
