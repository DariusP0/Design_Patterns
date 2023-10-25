
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();

        Command livingRoomOn = new TurnOnLightCommand(livingRoomLight);
        Command livingRoomOff = new TurnOffLightCommand(livingRoomLight);
        Command kitchenOn = new TurnOnLightCommand(kitchenLight);
        Command kitchenOff = new TurnOffLightCommand(kitchenLight);

        RemoteControl remote = new RemoteControl();
        remote.addCommand(livingRoomOn);
        remote.addCommand(livingRoomOff);
        remote.addCommand(kitchenOn);
        remote.addCommand(kitchenOff);


        remote.pressButton(0); // Turn on living room light
        remote.pressButton(1); // Turn off living room light
        remote.pressButton(2); // Turn on kitchen light
        remote.pressButton(3); // Turn off kitchen light
    }
}
