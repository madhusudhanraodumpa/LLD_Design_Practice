package Designs.Design_ParkingLot.startigies;

import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.model.ParkingLot;
import Designs.Design_ParkingLot.model.ParkingSpot;
import Designs.Design_ParkingLot.model.VechileType;
import Designs.Design_ParkingLot.repositories.ParkingLotRepository;
import Designs.Design_ParkingLot.repositories.ParkingSpotRepository;

import java.util.List;
import java.util.Random;

public class RandomParkingSpotAssignmentStartigey implements ParkingSpotAssignmentStartigey{
    ParkingLotRepository parkingLotRepository;
    ParkingSpotRepository parkingSpotRepository;
    Random random = new Random();

    public RandomParkingSpotAssignmentStartigey(ParkingLotRepository parkingLotRepository,ParkingSpotRepository parkingSpotRepository) {
        this.parkingLotRepository =parkingLotRepository;
        this.parkingSpotRepository =parkingSpotRepository;

    }
    @Override
    public ParkingSpot assignSpot(int vechileNumber, VechileType vechileType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(gate);
        List<ParkingSpot> parkingSpotList = parkingSpotRepository.getParkingSpots(parkingLot);
        return parkingSpotList.get(random.nextInt(parkingSpotList.size()));
    }
}
