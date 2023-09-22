package strategy.birdDesign;

public class Sparrow extends Bird{

    Flyable flyable;
    Sparrow(Flyable flyable){
        this.flyable = flyable;
    }

    public void makeSound(){
            System.out.println(" sparrow sound");
    }
    public  void fly(){
            flyable.fly();
    }


}
