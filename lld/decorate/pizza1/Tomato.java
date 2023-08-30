package decorate.pizza1;

import decorate.pizza1.Pizza;
import decorate.pizza.PizzaDecorator;

public class Tomato implements Pizza {
    Pizza pizza;
    public Tomato(Pizza pizza){
        this.pizza =pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }

    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String description() {
        return this.pizza.description() +" + "+name();
    }
}
