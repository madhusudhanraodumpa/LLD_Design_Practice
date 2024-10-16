package Designs.Design_Elevator.components;

import Designs.Design_Elevator.Button.*;

import java.util.List;

public class ElevatorCar {
    private int elevatorId;
    private Display display;
    private Direction direction;
    private int currentFloor;
    private Button floorInternalButton;
    private ComponentButton floorFanButton;
    private ComponentButton floorLightButton;
    private ComponentButton floorEmergencyButton;
    private Door door;

    private ElevatorStatus elevatorStatus;

    public ElevatorStatus getElevatorStatus() {
        return elevatorStatus;
    }

    public void setElevatorStatus(ElevatorStatus elevatorStatus) {
        this.elevatorStatus = elevatorStatus;
    }

    public ElevatorCar(int elevatorId) {
        this.elevatorId = elevatorId;
        this.currentFloor = 0;
        this.door = new Door();
        this.floorFanButton = new FanInternalButton();
       this.floorLightButton = new LightInternalButton();
       this.floorEmergencyButton = new EmergencyInternalButton();
       this.floorInternalButton = new FloorInternalButton(this.elevatorId);
        this.direction =Direction.NONE;
        this.display = new Display();
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Button getFloorInternalButton() {
        return floorInternalButton;
    }

    public void setFloorInternalButton(Button floorInternalButton) {
        this.floorInternalButton = floorInternalButton;
    }

    public ComponentButton getFloorFanButton() {
        return floorFanButton;
    }

    public void setFloorFanButton(ComponentButton floorFanButton) {
        this.floorFanButton = floorFanButton;
    }

    public ComponentButton getFloorLightButton() {
        return floorLightButton;
    }

    public void setFloorLightButton(ComponentButton floorLightButton) {
        this.floorLightButton = floorLightButton;
    }

    public ComponentButton getFloorEmergencyButton() {
        return floorEmergencyButton;
    }

    public void setFloorEmergencyButton(ComponentButton floorEmergencyButton) {
        this.floorEmergencyButton = floorEmergencyButton;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void move(Direction dir, int floor)
    {
        System.out.println("Elevator " + elevatorId + "moving " + dir);
        System.out.println("Elevator " + elevatorId + "stops at floor " + floor);
        door.open(elevatorId);
        door.close(elevatorId);

        //called everytime when currFloor value changes
        setDisplay();

    }

    public void pressButton(int floor)
    {
        Direction dir= Direction.NONE;
        if(floor>currentFloor)
            dir= Direction.UP;
        else if(floor<currentFloor)
            dir= Direction.DOWN;
       // button.pressButton(floor, dir, elevatorId);
    }


    private void setDisplay()
    {
        display.setFloor(currentFloor);
        display.setDirection(direction);

    }

}
