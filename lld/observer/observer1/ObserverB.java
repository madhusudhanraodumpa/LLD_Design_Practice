package observer.observer1;

public class ObserverB implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("ObserverB "+m.getMessage());
    }
}
