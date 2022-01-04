package decorator.component;

import decorator.component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(int size) {
        description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89*size;
    }
}
