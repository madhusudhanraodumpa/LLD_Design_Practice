package strategy.martialart.design1.design2;

// implemqantation : Now let us say the Karate and KungFu fighters have a special type of kick called flying kick. Both the classes now need to override the kick method to do a flying kick
public class Client {
    public static void main(String[] args) {
        MartialArt martialArt = new Karate();
        martialArt.kick();
        martialArt.punch();
    }
}

// Here arises the second problem with this design: Problem 2: Multiple classes need to be touched to edit the common functionality among them, and we move away from the benefits of inheritance and introduce duplication in the code

