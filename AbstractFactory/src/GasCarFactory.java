public class GasCarFactory implements CarFactory {
    public Car createCar() {
        return new GasCar();
    }
}
