package Designs.Design_CarRental;

import java.util.ArrayList;
import java.util.List;

public class CarInvetory implements VechileInventory{
    List<Vechile> vechileList;
    public CarInvetory() {
        this.vechileList = new ArrayList<>();
    }

    @Override
    public void addVechile(Vechile vechile) {
        vechileList.add(vechile);
    }

    @Override
    public void removeVechile(Vechile vechile) {
        vechileList.remove(vechile);
    }
}
