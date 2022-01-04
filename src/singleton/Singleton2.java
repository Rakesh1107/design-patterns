package singleton;

public enum Singleton2 {
    // Singleton with enum - the best way to implement Singleton
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
