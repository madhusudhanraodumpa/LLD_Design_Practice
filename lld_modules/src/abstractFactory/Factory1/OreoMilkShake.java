package abstractFactory.Factory1;

public class OreoMilkShake implements MilkShake{
    @Override
    public void prepareMilkShake() {
        System.out.println("Oreo Milk is prepared:");
    }
}
