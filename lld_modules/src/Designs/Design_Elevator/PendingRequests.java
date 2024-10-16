package Designs.Design_Elevator;

import Designs.Design_Elevator.components.Direction;

public class PendingRequests {

    private int floor;
    private Direction dir;

    public  PendingRequests(int floor, Direction dir)
    {
        this.floor= floor;
        this.dir= dir;
    }
}
