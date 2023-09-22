package bridge.vechile;

public class Bike implements Vechile{
    Work work;
    public Bike(Work work){
        this.work = work;
    }

    @Override
    public void prepare() {
        System.out.println("Bike "+work.work());
    }
}
