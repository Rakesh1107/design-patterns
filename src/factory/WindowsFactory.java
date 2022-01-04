package factory;

public class WindowsFactory implements Factory {
    @Override
    public OS getInstance() {
        return new Windows();
    }
}
