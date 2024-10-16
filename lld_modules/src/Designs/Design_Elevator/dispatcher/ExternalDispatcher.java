package Designs.Design_Elevator.dispatcher;

import Designs.Design_Elevator.components.Direction;
import Designs.Design_Elevator.components.ElevatorCar;
import Designs.Design_Elevator.components.ElevatorController;
import Designs.Design_Elevator.components.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ExternalDispatcher {


    private List<ElevatorController> elevatorControllerList;

    public ExternalDispatcher() {
        this.elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();
    }

    public void submitRequest(int floorId, Direction direction) {

        int elevatorControllerId= ElevatorSystem.elevatorSelectionStrategy.selectElevator(floorId, direction);
        System.out.println("Selected elevator " + elevatorControllerId);

        for (ElevatorController elevatorController : ElevatorSystem.INSTANCE.getElevatorControllerList()) {

            if(elevatorController.getElevatorControllerId() == elevatorControllerId) {
                elevatorController.acceptRequest(floorId,direction);
            }

        }


    }



}
