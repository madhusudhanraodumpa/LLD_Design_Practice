package BirdDesignV2;

import java.util.ArrayList;
import java.util.List;

//This solution for SRP and OCP. here each class single responbility nad no code duplication . And also open extension and close for modification.
// If you want to add any new bird type then its easly extensionable.

//Issue is suppose here all the birds are flyable and dancable and soundable but if we want make its some bird can fly and some can't
//Similar way some birds can dance and cant dance
//Simillar way some birds can sound and cant sound.
//Solution for this is we can make it one more layer of abstarction for fly then its solve the problem. But we want combination of behaviour like fly and dance,dance and sound ,only fly etc like that iin that case no of classes will create exponsilly . for this issue we can fix it using LSP(Liskov's subtution principle)
public class Client {
    public static void main(String args[]){

        List<Bird> birdList = new ArrayList<>();
        Bird b = new Pigeon();
        birdList.add(b);
        b= new Owl();
        birdList.add(b);
        b=new Sparrow();
        birdList.add(b);
        for(Bird b1 :birdList){
            b1.makeSound();
            b1.dance();
            b1.fly();
            System.out.println("--------------------------");
        }




    }
}
