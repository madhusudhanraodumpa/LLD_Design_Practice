package BirdDesignV4;

public abstract class Bird {
    public String birdType;
    public int noOfLegs;
    public int getNoWings;
    public String color;
    public double weight;


    //makesound(),fly(),dance() voilates single responbility principle and open close principle.

    public abstract void makeSound();



}
