package strategy.martialart.design1.design3;

public class FlyingKickStrategy implements KickStrategy{
    @Override
    public void kick() {
        System.out.println("Flying kick.");
    }
}
