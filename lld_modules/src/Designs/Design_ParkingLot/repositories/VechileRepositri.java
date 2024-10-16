package Designs.Design_ParkingLot.repositories;

import Designs.Design_ParkingLot.model.Vechile;
import Designs.Design_ParkingLot.model.VechileType;

import java.util.HashMap;
import java.util.Map;

public class VechileRepositri {
    private Map<Integer, Vechile> vechilesMap = new HashMap<>();
    private int vechileSequence = 0;

    public Vechile createVechile(int vechileNumber, VechileType vechileType,String vechileOwnerName) {
        Vechile vechile = new Vechile();
        vechile.setId(vechileSequence++);
        vechile.setVechileNumber(vechileNumber);
        vechile.setVechileType(vechileType);
        vechile.setOwnerName(vechileOwnerName);
        vechilesMap.put(vechileNumber,vechile);
        return vechile;

    }
}
