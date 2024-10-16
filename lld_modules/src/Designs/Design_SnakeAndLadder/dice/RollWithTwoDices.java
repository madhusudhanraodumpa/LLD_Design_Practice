package Designs.Design_SnakeAndLadder.dice;

import java.util.concurrent.ThreadLocalRandom;

public class RollWithTwoDices implements Dice{

    int max=0;
    int min=0;
    public RollWithTwoDices() {
        this.max=12;
        this.min=2;
    }

    @Override
    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(min,max+1);
    }
}
