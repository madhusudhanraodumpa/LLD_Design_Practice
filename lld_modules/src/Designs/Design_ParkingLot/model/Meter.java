package Designs.Design_ParkingLot.model;

public class Meter extends BaseModel {
    public int getNumberOfConsumption() {
        return numberOfConsumption;
    }

    public void setNumberOfConsumption(int numberOfConsumption) {
        this.numberOfConsumption = numberOfConsumption;
    }

    private int numberOfConsumption;
}
