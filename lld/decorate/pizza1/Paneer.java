package decorate.pizza1;


import decorate.pizza.PizzaDecorator;

public class Paneer implements Pizza {
    Pizza pizza;

    public Paneer(Pizza pizza){
        this.pizza =pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + 60;
    }

    @Override
    public String name() {
        return "Paneer";
    }

    @Override
    public String description() {
        return this.pizza.description() +" + "+name();
    }
}
