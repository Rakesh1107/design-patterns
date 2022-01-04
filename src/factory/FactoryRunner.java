package factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new WindowsFactory();
        OS obj = factory.getInstance();
        obj.showSpecs();
    }
}
