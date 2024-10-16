package Designs.Design_ParkingLot.model;

public class ElectricParkingSpot extends ParkingSpot{
    private Meter meter;

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }
}
