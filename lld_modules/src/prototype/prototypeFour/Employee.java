package prototype.prototypeFour;

public class Employee implements ProtoType<Employee> {
    private String name;
    private String location;
    private String companyName;
    private String batchName;
    private int age;
    private double sal;


    public void setName(String name) {
        this.name = name;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setSal(double sal) {
        this.sal = sal;
    }

    Employee(){}
    Employee(Employee e){
        this.name=e.name;
        this.age=e.age;
        this.sal=e.sal;
        this.location=e.location;
        this.companyName=e.companyName;
        this.batchName =e.batchName;
    }

   @Override
    public Employee copy(){
        return new Employee(this);
    }

}
