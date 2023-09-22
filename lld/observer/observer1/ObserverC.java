package observer.observer1;

public class ObserverC implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("ObserverC "+m.getMessage());
    }
}
