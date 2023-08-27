package BirdDesignV4;

import java.util.ArrayList;
import java.util.List;

//requriments is some bird can fly and some birds cant fly.
//Solution for this is we can make it one more layer of abstarction for fly then its solve the problem. But we want combination of behaviour like fly and dance,dance and sound ,only fly etc like that iin that case no of classes will create exponsilly . for this issue we can fix it using LSP(Liskov's subtution principle)
public class Client {
    public static void main(String args[]){

     Bird b =new Pigeon();






    }
}
