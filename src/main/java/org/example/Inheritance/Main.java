package org.example.Inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW", "X5", 2000);
        vehicle.displayInfo();

        Car car = new Car("Mercedes-Benz","E-Class", 2015, 2);
        car.displayCarInfo();
    }
}
