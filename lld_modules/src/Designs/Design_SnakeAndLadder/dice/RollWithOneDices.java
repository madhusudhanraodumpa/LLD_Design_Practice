package Designs.Design_SnakeAndLadder.dice;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RollWithOneDices implements Dice{
    int max=0;
    int min=0;
    public RollWithOneDices() {
        this.max=6;
        this.min=1;
    }

    Random random = null;
    @Override
    public int rollDice() {

        return ThreadLocalRandom.current().nextInt(min,max+1);

        //return (int)random.nextInt(max-min)+1;
    }
}
