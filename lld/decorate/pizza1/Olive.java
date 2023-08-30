package decorate.pizza1;


import decorate.pizza.PizzaDecorator;

public class Olive implements Pizza {
    Pizza pizza;
    public Olive(Pizza pizza){
        this.pizza =pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }

    @Override
    public String name() {
        return "Olive";
    }

    @Override
    public String description() {
        return this.pizza.description() +" + "+name();
    }
}
