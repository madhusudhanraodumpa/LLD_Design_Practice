package Designs.Design_ParkingLot.startigies;

import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.model.ParkingSpot;
import Designs.Design_ParkingLot.model.VechileType;

public interface ParkingSpotAssignmentStartigey {
    public ParkingSpot assignSpot(int vechileNumber, VechileType vechileType, Gate gate);
}
