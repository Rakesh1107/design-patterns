package singleton;

public class Singleton3 {
    // Synchronized method - prevents Multi-threading problems

    private static Singleton3 uniqueInstance;

    private Singleton3() {}

    public static synchronized Singleton3 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton3();
        }
        return uniqueInstance;
    }

}
