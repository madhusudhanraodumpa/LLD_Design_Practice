package Designs.Design_ParkingLot.repositories;

import Designs.Design_ParkingLot.model.ParkingFloor;
import Designs.Design_ParkingLot.model.ParkingLot;
import Designs.Design_ParkingLot.model.ParkingSpot;
import Designs.Design_ParkingLot.model.SpotStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingSpotRepository {

    public List<ParkingSpot> getParkingSpots(ParkingLot parkingLot) {
        List<ParkingFloor> parkingFloorList = parkingLot.getParkingFloorList();
        List<ParkingSpot> parkingSpotList = new ArrayList<>();

        for (ParkingFloor parkingFloor : parkingFloorList) {
            List<ParkingSpot> parkingSpots = parkingFloor.getParkingSpotList();
            parkingSpotList.addAll(parkingSpots.stream().filter(e->e.getSpotStatus().equals(SpotStatus.AVILABLE)).collect(Collectors.toList()));
        }

        return parkingSpotList;

    }
}
