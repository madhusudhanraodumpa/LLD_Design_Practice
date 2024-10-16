package Designs.Design_ParkingLot.exceptions;

public class NoParkingSpotAvailableException extends Exception {
    public NoParkingSpotAvailableException(String message) {
        super(message);
    }
}
