public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = year;
        this.speed = 0;
    }

    public void startCar() {
        System.out.println("Сar " + brand + " " + model + " has started");
    }

    public void accelerateCar(int increase) {
        speed += increase;
        System.out.println("Сar " + brand + " " + model + " accelerated to " + speed + " km/h");
    }

    public void displaySpeed() {
        System.out.println("Current speed of " + brand + " " + model + " is " + speed + " km/h.");
    }
}
