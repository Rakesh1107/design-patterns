package decorator.component;

import decorator.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(int size) {
        description = "Dark Roast";
        this.size = size;
    }

    @Override
    public double cost() {
        return .99*size;
    }
}
