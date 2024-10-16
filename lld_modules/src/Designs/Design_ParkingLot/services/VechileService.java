package Designs.Design_ParkingLot.services;

import Designs.Design_ParkingLot.model.Vechile;
import Designs.Design_ParkingLot.model.VechileType;
import Designs.Design_ParkingLot.repositories.VechileRepositri;

public class VechileService {
    VechileRepositri vechileRepositri;
    public VechileService(VechileRepositri vechileRepositri) {
        this.vechileRepositri = vechileRepositri;
    }

    public Vechile getVechile(int vechileNumber) {

        return null;
    }

    public Vechile registerVechile(int vechileNumber, VechileType vechileType,String vechileOwnerName) {
       Vechile vechile = vechileRepositri.createVechile(vechileNumber,vechileType,vechileOwnerName);
       return vechile;
    }
}
