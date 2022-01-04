package singleton;

public class Singleton4 {
    // Eager initialization
    // use if instance is always needed or not resource intensive
    private static Singleton4 uniqueInstance = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return uniqueInstance;
    }
}
