package Designs.Design_Elevator.Button;

import Designs.Design_Elevator.components.Direction;
import Designs.Design_Elevator.dispatcher.ExternalDispatcher;

public class FloorExternalButton implements Button{
    private ExternalDispatcher externalDispatcher;
    private Direction direction;

    public FloorExternalButton() {
        this.externalDispatcher = new ExternalDispatcher();
    }

    @Override
    public void pressButton(int floorId, Direction direction) {
        this.direction =direction;
        System.out.println("Pressed " + direction + " from floor " + floorId);
        this.externalDispatcher.submitRequest(floorId,direction);
    }
}
