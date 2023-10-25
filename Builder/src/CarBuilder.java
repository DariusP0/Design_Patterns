public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        reset();
    }

    public void reset() {
        car = new Car();
    }

    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public void setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
    }

    public void setGPS(boolean hasGPS) {
        car.setGPS(hasGPS);
    }

    public Car getProduct() {
        return car;
    }
}