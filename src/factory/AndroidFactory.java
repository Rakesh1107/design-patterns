package factory;

public class AndroidFactory implements Factory {
    @Override
    public OS getInstance() {
        return new Android();
    }
}
