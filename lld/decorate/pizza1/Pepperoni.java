package decorate.pizza1;

import decorate.pizza1.Pizza;

public class Pepperoni implements Pizza {
    @Override
    public int cost() {
        return 180;
    }

    @Override
    public String name() {
        return "Pepperoni";
    }

    @Override
    public String description() {
        return "Pepperoni";
    }
}
