package decorate.pizza1;

import decorate.pizza1.Pizza;

public class Margherita implements Pizza {
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String name() {
        return "Margherita";
    }

    @Override
    public String description() {
        return "Margherita";
    }
}
