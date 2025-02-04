public class CarRunner {
    public static void main(String[] args) {
        Car testCar1 = new Car("BMW","X5", "Black", 2000);
        testCar1.startCar();
        testCar1.accelerateCar(20);
        testCar1.displaySpeed();

        Car testCar2 = new Car("Mercedes-Benz","E-Class", "white", 2015);
        testCar2.startCar();
        testCar2.accelerateCar(50);
        testCar2.displaySpeed();
    }
}
