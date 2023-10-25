public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    public void reset() {
        manual = new Manual();
    }

    public void setSeats(int seats) {
        String content = " This car has " + seats + " seats";
        manual.addManualContent(content);
    }

    public void setEngine(String engine) {
        String content = "; Engine instructions: " + engine;
        manual.addManualContent(content);
    }

    public void setTripComputer(boolean hasTripComputer) {
        String content = "; Trip Computer instructions: " + (hasTripComputer ? "installed" : "not installed");
        manual.addManualContent(content);
    }

    public void setGPS(boolean hasGPS) {
        String content = "; GPS instructions: " + (hasGPS ? "installed" : "not installed");
        manual.addManualContent(content);
    }

    public Manual getProduct() {
        return manual;
    }
}
