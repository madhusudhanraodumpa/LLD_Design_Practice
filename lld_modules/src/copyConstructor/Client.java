package copyConstructor;

public class Client {
    public static void main(String args[]){
        Employee e=new Employee();
        e.name="Madhusudhan";
        e.age=37;
        e.sal=1000;
        Employee e1=new Employee(e);
        System.out.println(e.name);
        System.out.println(e1.name);
        System.out.println("-------------------------");
        e1.name="Madhusudhan1";
        System.out.println(e.name);
        System.out.println(e1.name);

        String s1="Madhusudhan";
        String s2= new String("Madhusudhan");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);






    }
}
