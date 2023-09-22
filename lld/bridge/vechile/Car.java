package bridge.vechile;

public class Car implements Vechile{

    Work work;
    public Car(Work work){
        this.work = work;
    }

    @Override
    public void prepare() {
        System.out.println("Car "+work.work());
    }
}
