package observer.observer1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observerList = new ArrayList<>();
    private static ConcreteSubject instance;
    private ConcreteSubject(){
        this.observerList =  new ArrayList<>();
    }

    public static ConcreteSubject getInstance() {
        if(instance == null) {
            synchronized (ConcreteSubject.class) {

                if(instance == null) {
                    instance = new ConcreteSubject();
                }
            }

        }
        return instance;

    }

    @Override
    public void attach(Observer observer) {
        if(observerList != null) {
            observerList.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {

        if(observerList !=null ){
            observerList.remove(observer);
        }
    }

    @Override
    public void notify(Message message) {
        for(Observer observer : observerList) {
            observer.update(message);
        }

    }
}
