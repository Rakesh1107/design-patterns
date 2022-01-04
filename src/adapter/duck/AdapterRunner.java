package adapter.duck;

public class AdapterRunner {
    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyDuck = new TurkeyAdapter(wildTurkey);

        Duck mallardDuck = new MallardDuck();

        testDuck(mallardDuck);
        testDuck(turkeyDuck);

        Turkey duckTurkey = new DuckAdapter(mallardDuck);
        testTurkey(duckTurkey);
        testTurkey(wildTurkey);
    }

    private static void testTurkey(Turkey turkey) {
        turkey.fly();
        turkey.gobble();
    }

    private static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
