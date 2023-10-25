
public class Main {
    public static void main(String[] args) {
        // Create an Electric Car using the ElectricCarFactory
        CarFactory electricCarFactory = new ElectricCarFactory();
        Car electricCar = electricCarFactory.createCar();
        electricCar.start();
        electricCar.stop();

        // Create a Gas-powered Car using the GasCarFactory
        CarFactory gasCarFactory = new GasCarFactory();
        Car gasCar = gasCarFactory.createCar();
        gasCar.start();
        gasCar.stop();
    }
}
