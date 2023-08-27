package prototype.prototypeFour;

public class Client {
    public static void main(String args[]){
        EmployeeRegistry employeeRegistry = new EmployeeRegistry();
       loadRegistry(employeeRegistry);

        Employee e = employeeRegistry.get("May 2023").copy();
        e.setAge(27);
        e.setSal(10.0);
        e.setLocation("Hyderabad");
        e.setName("Madhu");

        Employee e1 = employeeRegistry.get("May 2023").copy();
        e1.setAge(77);
        e1.setSal(10);
        e1.setLocation("Banglore");
        e1.setName("Raju");

        Employee e2=employeeRegistry.get("May 2023_Best").copy();
        e2.setAge(747);
        e2.setSal(140);
        e2.setLocation("Pune");
        e2.setName("Ram");



        Employee e3=employeeRegistry.get("May 2023_Best").copy();

        e3.setAge(56);
        e3.setSal(890);
        e3.setLocation("Mumbai");
        e3.setName("Mohan");


        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());


        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
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
