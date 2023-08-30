package decorate;

public class ChocolateCone implements Icecream{
    Icecream icecream;
    public ChocolateCone(){

    }
    public ChocolateCone(Icecream icecream){
        this.icecream =icecream;
    }
    @Override
    public double getCost() {
        if(icecream ==null)
        return 25;
        else
            return icecream.getCost() + 25;
    }

    @Override
    public String getDescription() {
        if(icecream ==null)
            return "ChocolateCone ";
        else
            return icecream.getDescription()+"ChocolateCone ";
    }
}
