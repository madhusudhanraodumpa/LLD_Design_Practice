package Designs.Design_Elevator.strategy;

import Designs.Design_Elevator.PendingRequests;
import Designs.Design_Elevator.components.ElevatorController;
import Designs.Design_Elevator.components.ElevatorSystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElevatorControlStrategy {
    private Queue<PendingRequests> pendingRequestList= new LinkedList<>();
    private List<ElevatorController> elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();

    public void moveElevator(ElevatorController elevatorController)
    {


    }

    public Queue<PendingRequests> getPendingRequestList() {
        return pendingRequestList;
    }

    public void setPendingRequestList(Queue<PendingRequests> pendingRequestList) {
        this.pendingRequestList = pendingRequestList;
    }

    public List<ElevatorController> getElevatorControllerList() {
        return elevatorControllerList;
    }

    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }
}
