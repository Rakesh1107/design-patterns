package command;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightsOff();
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightsOn();
    }
}
