package deepCopy;



import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String args[]){

        CloneDeep cloneDeep =new CloneDeep();
        Map<Integer,Integer> map =new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        cloneDeep.name= "Madhusudhan";
        cloneDeep.map =map;

        CloneDeep c1 =new CloneDeep(cloneDeep);


        System.out.println(cloneDeep.name);
        System.out.println(c1.name);

        System.out.println(cloneDeep.name.hashCode());

        System.out.println(c1.name.hashCode());

        System.out.println(cloneDeep==c1);           //false
        System.out.println(cloneDeep.name==c1.name); //false
        System.out.println(cloneDeep.map==c1.map);

        c1.name="Raju";

        System.out.println(cloneDeep.name);

        System.out.println(c1.name);

        System.out.println(cloneDeep.name.hashCode());

        System.out.println(c1.name.hashCode());
        //System.out.println(c1.name);

    }
}
