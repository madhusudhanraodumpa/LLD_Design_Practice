package strategy.martialart.design1.design3;

// implemqantation : Now let us say the Karate and KungFu fighters have a special type of kick called flying kick. Both the classes now need to override the kick method to do a flying kick
public class Client {
    public static void main(String[] args) {
        MartialArt martialArt = new KungFu(new NormalKickStrategy());
        martialArt.kick();
        martialArt.punch();
    }
}


