package strategy.martialart.design1.design3;

public class NormalKickStrategy implements KickStrategy{
    @Override
    public void kick() {
        System.out.println("Normal Kick");
    }
}
