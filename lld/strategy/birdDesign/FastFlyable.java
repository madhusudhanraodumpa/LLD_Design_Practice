package strategy.birdDesign;

public class FastFlyable implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fast flyable.");
    }
}
