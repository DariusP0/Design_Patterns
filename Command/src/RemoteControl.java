import java.util.ArrayList;
import java.util.List;

class RemoteControl {
    private List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    void pressButton(int index) {
        if (index >= 0 && index < commands.size()) {
            Command command = commands.get(index);
            command.execute();
        }
    }
}
