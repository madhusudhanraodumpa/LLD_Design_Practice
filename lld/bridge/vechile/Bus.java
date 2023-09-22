package bridge.vechile;

public class Bus implements Vechile{

    Work work;
    public Bus(Work work){
        this.work = work;
    }

    @Override
    public void prepare() {
        System.out.println("Bus "+work.work());
    }
}
