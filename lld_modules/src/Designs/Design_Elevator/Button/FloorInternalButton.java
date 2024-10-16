package Designs.Design_Elevator.Button;

import Designs.Design_Elevator.components.Direction;
import Designs.Design_Elevator.dispatcher.InternalDispatcher;

import java.util.ArrayList;
import java.util.List;

public class FloorInternalButton implements Button{


    private InternalDispatcher idispatcher;

    private int elevatorId;

    public FloorInternalButton(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    private List<Integer> floors= new ArrayList<>();

    public FloorInternalButton()
    {
        idispatcher = new InternalDispatcher();
    }


    @Override
    public void pressButton(int floorId, Direction direction) {
        floors.add(floorId);
        System.out.println("Pressed floor "+ floorId + " from elevator "+ elevatorId);
        idispatcher.submitRequest(floorId, direction, elevatorId);
    }
}
