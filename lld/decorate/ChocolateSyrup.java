package decorate;

public class ChocolateSyrup implements Icecream{

    Icecream icecream;
    ChocolateSyrup(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public double getCost() {
        return icecream.getCost()+34;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "ChocolateSyrup ";
    }
}
