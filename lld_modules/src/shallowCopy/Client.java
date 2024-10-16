package shallowCopy;

public class Client {
    public static void main(String args[]){
        Employee e=new Employee();
        e.name="Madhusudhan";
        e.age=37;
        e.sal=1000;
        Employee e1=e;
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.sal);
        System.out.println("--------------------------------");
        e1.name="Raju";
        System.out.println(e1.name);
        System.out.println(e.name);
        System.out.println("-----------------------------");
        e1.name =new String("Raju");
        System.out.println(e1.name);
        System.out.println(e.name);





    }
}
