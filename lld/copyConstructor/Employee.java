package copyConstructor;

public class Employee {
    public String name;
    public int age;
    public double sal;
    public Employee(Employee e1){
        this.name = e1.name;
        this.age=e1.age;
        this.sal=e1.sal;

    }
    public Employee(){}


}
