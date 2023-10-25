import java.util.ArrayList;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay display = new TemperatureDisplay();
        Fan fan = new Fan();

        weatherStation.addObserver(display);
        weatherStation.addObserver(fan);

        weatherStation.setTemperature(22); // Updates will be sent to both TemperatureDisplay and Fan
        weatherStation.setTemperature(28); // Updates will be sent to both TemperatureDisplay and Fan

        weatherStation.removeObserver(fan); // Unregister Fan

        weatherStation.setTemperature(30); // Update will be sent only to TemperatureDisplay
    }
}
