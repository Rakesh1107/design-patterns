package command;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo mode - CD");
    }

    public void setDVD() {
        System.out.println("Stereo mode - DVD");
    }

    public void setRadio() {
        System.out.println("Stereo mode - Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Volume level: " + volume);
    }
}
