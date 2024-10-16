package prototype.prototypeTwo;

public class Client {
    public static void main(String args[]){
        Employee e = new BestEmployee();
        e.setName("MAdhu");
        e.setAge(38);
        e.setBatchName("May 2023");
        e.setLocation("Hyderabad");
        e.setCompanyName("Mcafee");
        Employee eCopy = e.copy();


        System.out.println(e.hashCode());
        System.out.println(eCopy.hashCode());

    }

}
