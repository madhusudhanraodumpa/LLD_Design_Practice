package Designs.Design_Elevator.components;

import Designs.Design_Elevator.PendingRequests;

public class ElevatorController {
    private ElevatorCar elevatorCar;
    private int elevatorControllerId;

    public int getElevatorControllerId() {
        return elevatorControllerId;
    }

    public void setElevatorControllerId(int elevatorControllerId) {
        this.elevatorControllerId = elevatorControllerId;
    }

    public ElevatorController(int id)
    {
        this.elevatorControllerId= id;
        elevatorCar= new ElevatorCar(elevatorControllerId);
    }

    public void acceptRequest(int floorId,Direction direction) {
        ElevatorSystem.elevatorControlStrategy.getPendingRequestList().add(new PendingRequests(floorId, direction));

        controlCar();
    }

    private void controlCar()
    {

        ElevatorSystem.elevatorControlStrategy.moveElevator(this);
        System.out.println("Elevator moving...");
    }


    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }
}
