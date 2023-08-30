package decorate;

public class ChocolateScoop implements Icecream {
    Icecream icecream;

    public ChocolateScoop(Icecream icecream){
        this.icecream =icecream;
    }
    @Override
    public double getCost() {
        return icecream.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "ChocolateScoop ";
    }
}
