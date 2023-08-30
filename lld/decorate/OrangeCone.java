package decorate;

public class OrangeCone implements Icecream{

    Icecream icecream;
    public OrangeCone(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public double getCost() {
        return icecream.getCost() +27;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "OrangeCone ";
    }
}
