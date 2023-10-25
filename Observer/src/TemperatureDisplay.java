public class TemperatureDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("TemperatureDisplay: Temperature is now " + temperature + "°C");
    }
}
