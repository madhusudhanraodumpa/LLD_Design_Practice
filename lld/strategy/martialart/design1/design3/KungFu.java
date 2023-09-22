package strategy.martialart.design1.design3;

public class KungFu extends MartialArt {

    KickStrategy kickStrategy;
    public KungFu(KickStrategy kickStrategy){
        this.kickStrategy = kickStrategy;
    }
    @Override
    public void kick() {
        kickStrategy.kick();
    }


}
