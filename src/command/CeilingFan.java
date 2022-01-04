package command;

public class CeilingFan {
    String location;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void low() {
        System.out.println(location + "fan on with low speed");
        speed = LOW;
    }

    public void medium() {
        System.out.println(location + " fan on with medium speed");
        speed = MEDIUM;
    }

    public void high() {
        System.out.println(location + " fan on with high speed");
        speed = HIGH;
    }

    public void on() {
        speed = LOW;
        System.out.println(location + " fan is turned on");
    }

    public int getSpeed() {
        return speed;
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " fan is turned off");
    }
}
