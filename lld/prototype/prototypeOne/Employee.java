package prototype.prototypeOne;

public class Employee {
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
    Employee(Employee e){
        this.name=e.name;
        this.location = e.location;
        this.batchName = e.batchName;;
        this.companyName = e.companyName;
        this.sal = e.sal;
        this.age= e.age;
    }

}
