package singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        // Singleton with enum
        Singleton2 s1 = Singleton2.INSTANCE;
        s1.setValue(1);
        Singleton2 s2 = Singleton2.INSTANCE;
        s2.setValue(2);
        String ans = s1 == s2 ? "same" : "different";
        System.out.println(ans);
        System.out.println(s1.getValue());
        System.out.println(s2.getValue());

        // Lazy initialization
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton == singleton2) {
            System.out.println("same");
        }
        else {
            System.out.println("different");
        }
    }
}
