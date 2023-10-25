public class Car {
    private int seats;
    private String engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public void setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void showInfo() {
        System.out.println("Car with " + seats + " seats, engine: " + engine + ", Trip Computer: " + hasTripComputer + ", GPS: " + hasGPS);
    }
}
