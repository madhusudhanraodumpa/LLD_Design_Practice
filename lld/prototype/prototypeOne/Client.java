package prototype.prototypeOne;

public class Client {
    public static void main(String args[]){
        BestEmployee e = new BestEmployee();
        e.setName("MAdhu");
        e.setAge(38);
        e.setBatchName("May 2023");
        e.setLocation("Hyderabad");
        e.setCompanyName("Mcafee");
        Employee eCopy = null;
        if(e instanceof  Employee){
             eCopy = new Employee(e);
        } else if (e instanceof BestEmployee) {
            eCopy = new BestEmployee(e);

        }


        System.out.println(e.hashCode());
        System.out.println(eCopy.hashCode());

    }

}
