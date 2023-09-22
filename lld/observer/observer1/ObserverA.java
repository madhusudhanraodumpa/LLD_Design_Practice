package observer.observer1;

public class ObserverA implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("ObserverA " + m.getMessage());
    }
}
