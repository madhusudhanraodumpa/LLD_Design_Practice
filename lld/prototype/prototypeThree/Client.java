package prototype.prototypeThree;

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


        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());

    }
    public static void loadRegistry(EmployeeRegistry employeeRegistry){
        Employee e = new Employee();
        e.setBatchName("May 2023");
        e.setCompanyName("Mcafee");
        employeeRegistry.registry("May 2023",e);



    }

}
