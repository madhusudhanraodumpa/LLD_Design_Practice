package strategy.martialart.design1;

// implemqantation : Now the requirement is that Judo fighters do not kick or punch, but only grab. This is how we will implement the same:
public class Client {
    public static void main(String[] args) {
        MartialArt martialArt = new Judo();
        martialArt.kick();
        martialArt.punch();
    }
}

// Here problem is when ever we dont want any basic functionalities then we need ovverride exsting behaviour and implememt own way.

