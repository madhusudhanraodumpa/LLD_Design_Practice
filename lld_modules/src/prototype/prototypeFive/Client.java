package prototype.prototypeFive;

public class Client {
    public static void main(String args[]){
       Employee e=new Employee();
       e.setAge(23);
       e.setLocation("Delhi");
       e.setSal(1234);
       e.setName("Krishana");
       e.setCompanyName("Mcafee");
       e.setBatchName("April 2023");
        try {
            Employee e2=(Employee) e.clone();
            Employee e3=(Employee) e.clone();
            System.out.println(e.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }


    }
    public static void loadRegistry(EmployeeRegistry employeeRegistry){
        Employee e = new Employee();
        e.setBatchName("May 2023");
        e.setCompanyName("Mcafee");
        employeeRegistry.registry("May 2023",e);

        BestEmployee e1 = new BestEmployee();
        e1.setBatchName("May 2023_Best");
        e1.setCompanyName("Mcafee");
        e1.setAwardName("Gold");
        employeeRegistry.registry("May 2023_Best",e1);



    }

}
