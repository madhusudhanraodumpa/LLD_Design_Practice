package prototype.prototypeFour;

public class BestEmployee extends Employee {
    private String awardName;

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    BestEmployee(){}
    BestEmployee(BestEmployee e){
        super(e);
    }
    @Override
    public BestEmployee copy(){
       return new BestEmployee(this);
    }
}
