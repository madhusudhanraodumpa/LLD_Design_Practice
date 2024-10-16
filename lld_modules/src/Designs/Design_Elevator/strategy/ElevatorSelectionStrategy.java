package Designs.Design_Elevator.strategy;

import Designs.Design_Elevator.components.Direction;
import Designs.Design_Elevator.components.ElevatorController;
import Designs.Design_Elevator.components.ElevatorSystem;

import java.util.List;

public class ElevatorSelectionStrategy {
    protected List<ElevatorController> elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();


    public int selectElevator(int floor, Direction dir) {
        return 0;
    }
}
