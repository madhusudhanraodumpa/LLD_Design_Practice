package decorate.pizza1;

import decorate.pizza1.Pizza;

public class BBQChicken implements Pizza {
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String name() {
        return "BBQChicken";
    }

    @Override
    public String description() {
        return "BBQChicken";
    }
}
