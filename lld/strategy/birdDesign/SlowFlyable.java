package strategy.birdDesign;

public class SlowFlyable implements Flyable{
    @Override
    public void fly() {
        System.out.println("Slow Flyable");
    }
}
