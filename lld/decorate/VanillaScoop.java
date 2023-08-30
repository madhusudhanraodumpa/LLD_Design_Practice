package decorate;

public class VanillaScoop implements Icecream{
    Icecream icecream;

    public VanillaScoop(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public double getCost() {
        return icecream.getCost() + 44;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "VanillaScoop ";
    }
}
