package Designs.Design_ParkingLot.repositories;

import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.model.GateStatus;
import Designs.Design_ParkingLot.model.GateType;
import Designs.Design_ParkingLot.model.Vechile;

import java.util.HashMap;
import java.util.Map;

public class GateRepositri {

    private Map<Integer, Gate> gatesMap = new HashMap<>();
    public  GateRepositri() {
        Gate gate = new Gate();
        gate.setGateNumber(122);
        gate.setGateStatus(GateStatus.OPNE);
        gate.setGateType(GateType.ENTRY);
        gate.setId(gateSequence++);
        gatesMap.put(122,gate);
    }
    private int gateSequence = 0;

    public Gate getGate(int gateNumber) {
        return gatesMap.get(gateNumber);
    }

}
