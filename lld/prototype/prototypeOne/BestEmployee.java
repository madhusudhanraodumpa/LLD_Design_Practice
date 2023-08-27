package prototype.prototypeOne;

public class BestEmployee extends Employee{
    private String awardName;
    BestEmployee(){}
    BestEmployee(BestEmployee e){
        super(e);
        this.awardName ="Bronze";

    }
}
