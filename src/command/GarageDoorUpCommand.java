package command;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightsOn();
    }

    @Override
    public void undo() {
        garageDoor.lightsOff();
        garageDoor.down();
    }
}
