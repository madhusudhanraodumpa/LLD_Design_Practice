package BirdDesignV1;

public class Bird {
    public String birdType;
    public int noOfLegs;
    public int getNoWings;
    public String color;
    public double weight;


    //makesound(),fly(),dance() voilates single responbility principle and open close principle.

    public void makeSound(){

        if(birdType == "sparrow"){
            System.out.println(" sparrow sound");
        }else if(birdType == "pigeon"){
            System.out.println(" pigeon sound");
        }else if(birdType == "penguin"){
            System.out.println(" penguin sound");
        }else if(birdType == "owl"){
            System.out.println(" owl sound");
        }

    }
    public  void fly(){
        if(birdType == "sparrow"){
            System.out.println(" sparrow fly");
        }else if(birdType == "pigeon"){
            System.out.println(" pigeon fly");
        }else if(birdType == "penguin"){
            System.out.println(" penguin fly");
        }else if(birdType == "owl"){
            System.out.println(" owl fly");
        }
    }

    public void dance(){
        if(birdType == "sparrow"){
            System.out.println(" sparrow dance");
        }else if(birdType == "pigeon"){
            System.out.println(" pigeon dance");
        }else if(birdType == "penguin"){
            System.out.println(" penguin dance");
        }else if(birdType == "owl"){
            System.out.println(" owl dance");
        }
    }

}
