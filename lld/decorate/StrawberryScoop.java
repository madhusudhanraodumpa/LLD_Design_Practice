package decorate;

public class StrawberryScoop implements Icecream{
    Icecream icecream;

    public StrawberryScoop(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public double getCost() {
        return icecream.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "StrawberryScoop ";
    }
}
