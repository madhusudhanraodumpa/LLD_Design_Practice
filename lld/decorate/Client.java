package decorate;

public class Client {
    public static void main(String[] args) {
        Icecream icecream = new VanillaScoop(
                new ChocolateScoop(
                        new StrawberryScoop(
                                new OrangeCone(
                                        new ChocolateSyrup(
                                                new ChocolateCone())))));
        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());

    }
}
