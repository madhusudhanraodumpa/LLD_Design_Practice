package observer.observer1;

public class Client {
    public static void main(String[] args) {
        ObserverA a = new ObserverA();
        ObserverB b= new ObserverB();
        ObserverC c = new ObserverC();

        ConcreteSubject concreteSubject = ConcreteSubject.getInstance();
        concreteSubject.attach(a);
        concreteSubject.attach(b);
       // concreteSubject.attach(c);
        concreteSubject.notify(new Message("First update"));

        concreteSubject.attach(c);
        concreteSubject.attach(b);
        concreteSubject.notify(new Message("Second update"));

    }
}
