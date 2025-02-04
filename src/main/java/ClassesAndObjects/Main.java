package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Car testCar1 = new Car("BMW","X5", "Black", 2000);
        testCar1.startCar();
        testCar1.accelerateCar(20);
        testCar1.displaySpeed();

        Car testCar2 = new Car("Mercedes-Benz","E-Class", "White", 2015);
        testCar2.startCar();
        testCar2.accelerateCar(50);
        testCar2.displaySpeed();

        Person person1 = new Person("Yuliia", 35, "female");
        person1.introduceText();

        Person person2 = new Person("Alex", 20, "male");
        person2.introduceText();
    }
}
