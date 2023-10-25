public class ElectricCarFactory implements CarFactory {
    public Car createCar() {
        return new ElectricCar();
    }
}