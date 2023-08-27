package prototype.prototypeThree;

public class Employee implements ProtoType<Employee>{
    private String name;
    private String location;
    private String companyName;
    private String batchName;
    private int age;
    private double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    Employee(){}

   @Override
    public Employee copy(){
        Employee e = new Employee();
        e.name=this.name;
        e.location = this.location;
        e.batchName = this.batchName;;
        e.companyName = this.companyName;
        e.sal = this.sal;
        e.age= this.age;
        return e;
    }

}
