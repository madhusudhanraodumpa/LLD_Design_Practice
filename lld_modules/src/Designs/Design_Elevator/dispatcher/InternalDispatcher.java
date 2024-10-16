package Designs.Design_Elevator.dispatcher;

import Designs.Design_Elevator.components.Direction;
import Designs.Design_Elevator.components.ElevatorController;
import Designs.Design_Elevator.components.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class InternalDispatcher {

    public  void submitRequest(int floor, Direction dir, int elevatorId)
    {
        for(ElevatorController eController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(eController.getElevatorControllerId()== elevatorId)
            {
                eController.acceptRequest(floor, dir);
            }
        }
    }
}
