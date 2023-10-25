public class Fan implements Observer {
    public void update(int temperature) {
        if (temperature > 25) {
            System.out.println("Fan: It's too hot. Turning on the fan.");
        } else {
            System.out.println("Fan: It's cool. Turning off the fan.");
        }
    }
}