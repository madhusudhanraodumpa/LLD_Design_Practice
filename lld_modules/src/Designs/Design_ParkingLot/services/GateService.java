package Designs.Design_ParkingLot.services;

import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.repositories.GateRepositri;

public class GateService {
    GateRepositri gateRepositri;
    public GateService(GateRepositri gateRepositri) {
        this.gateRepositri = gateRepositri;
    }

    public Gate getGate(int gateNumber) {
        return gateRepositri.getGate(gateNumber);
    }
}
