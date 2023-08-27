package prototype.prototypeThree;

public class BestEmployee extends Employee  {
    private String awardName;
    BestEmployee(){}
    @Override
    public BestEmployee copy(){
        BestEmployee e = new BestEmployee();
        e.setName(this.getName());
        e.setBatchName(this.getBatchName());
        e.setAge(this.getAge());
        e.setLocation(this.getLocation());
        e.setSal(this.getSal());
        e.setCompanyName(this.getCompanyName());
        return e;
    }
}
