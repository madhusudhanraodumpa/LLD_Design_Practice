package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component : list) {
            component.showPrice();
        }

    }
    List<Component> list = new ArrayList<>();
    public void addComponent(Component component) {
        list.add(component);
    }
    public void removeComponent(Component component) {
        list.remove(component);
    }

}
