package factory;

public class IOSFactory implements Factory {
    @Override
    public OS getInstance() {
        return new IOS();
    }
}
