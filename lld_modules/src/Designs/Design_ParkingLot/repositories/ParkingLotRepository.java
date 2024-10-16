package Designs.Design_ParkingLot.repositories;

import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLots = new HashMap<>();

    public ParkingLot getParkingLot(Gate gate) {
        for (ParkingLot parkingLot : parkingLots.values()) {
            if (parkingLot.getGateList().contains(gate)) {
                return parkingLot;
            }
        }
        return null;
    }
}
