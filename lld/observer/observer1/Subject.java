package observer.observer1;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notify(Message message);
}
