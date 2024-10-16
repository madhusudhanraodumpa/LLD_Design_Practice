package Designs.Design_Elevator.building;

import Designs.Design_Elevator.Button.Button;
import Designs.Design_Elevator.Button.FloorExternalButton;
import Designs.Design_Elevator.components.Direction;
import Designs.Design_Elevator.components.Display;

public class Floor {
    private int floorId;
    private Button button;
    private Display display;

    public Floor(int floorId) {
        this.floorId = floorId;
        this.button = new FloorExternalButton();
    }
    public void pressButton(Direction direction) {
        button.pressButton(floorId,direction);
    }

    private  void setDisplay(int floor, Direction dir)
    {
        display.setDirection(dir);
        display.setFloor(floor);
    }
}
